package weather;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.ServerSocket;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.SerializerFactory;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.TypeMapping;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Weatherer {
	
	private static TreeMap<String, String> cache;
	// TODO: PortType
	private NdfdXMLPortType sq;
	private boolean offline;
	private boolean direct;
	private ArrayList<Callback> listeners;
	private int internalTime;
	
	public interface Callback {
		public void dataReceived(String data);
	}
	
	private void recursiveTest(int counter) {
		if (counter == 0) {
			saveStore();
		} else {
			counter-= 1;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// TODO: command line snapshot generation
			Weatherer wt = new Weatherer(false, false);
			
			java.util.Calendar c1 = java.util.Calendar.getInstance();
			java.util.Calendar c2 = java.util.Calendar.getInstance();
			c2.add(Calendar.HOUR_OF_DAY, -2);
			for (int i = 1; i < 10; i++ ) {
				System.out.println("Grabbing "+i);
				wt.NDFDgenLatLonList("38.00,-100,40.00,-78.00",
					new weather.ProductType("glance"),
					c1,
					c2,
					new weather.UnitType("e"),
					new weather.WeatherParametersType());
				System.out.println("SUCCESS");
			}
			saveStore();
			//System.out.println(s);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Weatherer(boolean offline, boolean direct) throws AxisFault,
			ServiceException {
		this.offline = offline;
		this.direct = direct;
		initStore();
		// TODO: (new Locator()).getPortType()
		this.sq = (new NdfdXMLLocator()).getndfdXMLPort();
	}

	public String keyifyArguments(String method, Object[] arguments) throws RemoteException {
		// Get everything we need to know about the methods parameters
		NdfdXMLBindingStub bs = (NdfdXMLBindingStub) sq;
		OperationDesc od = NdfdXMLBindingStub._operations[2];
		// Get everything we need to know to perform mapping
		Call ca = bs.createCall();
		TypeMapping tm = ca.getTypeMapping();
		// Create the output array
		StringWriter w = new StringWriter();
		w.write(method+",");
		// Iterate over parameters to convert them to their XML representation
		for (int i = 0; i < od.getParameters().size(); i += 1) {
			ParameterDesc pd = od.getParameter(i);
			SerializerFactory serf = tm.getSerializer(pd.getJavaType(), pd.getQName());
			org.apache.axis.encoding.Serializer ser = (org.apache.axis.encoding.Serializer) serf.getSerializerAs(ca.getEncodingStyle());
			SerializationContext sc = new SerializationContext(w);
			try {
				ser.serialize(pd.getQName(), null, arguments[i], sc);
				w.write(",");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		w.flush();
		return w.toString();
	}
	
	public void NDFDgenLatLonList(final java.lang.String listLatLon, 
			final weather.ProductType product, 
			final java.util.Calendar startTime, 
			final java.util.Calendar endTime, 
			final weather.UnitType unit, 
			final weather.WeatherParametersType weatherParameters,
			final Callback cb) throws RemoteException {
		Thread thread = new Thread() {
			public void run() {
				String result;
				try {
					result = NDFDgenLatLonList(listLatLon, 
							product, 
							startTime, 
							endTime, 
							unit, 
							weatherParameters);
					cb.dataReceived(result);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread.start();
	}

	public String NDFDgenLatLonList(java.lang.String listLatLon, 
			weather.ProductType product, 
			java.util.Calendar startTime, 
			java.util.Calendar endTime, 
			weather.UnitType unit, 
			weather.WeatherParametersType weatherParameters) throws RemoteException {
		// TODO: listof arguments
		Object[] args = { listLatLon, product, startTime, endTime, unit, weatherParameters };
		// TODO: method name
		String key = keyifyArguments("getQuote", args);

		if (!this.direct && isInStore(key)) {
			return restore(key);
		} else if (!this.offline) {
			// TODO: listof arguments
			String value = this.sq.NDFDgenLatLonList(listLatLon, product,
					startTime, endTime, unit, weatherParameters);
			key = getCurrentTime() + "," + key;
			store(key, value);
			return value;
		} else {
			throw new RemoteException();
		}
	}
	
	public void addCallback(Callback c) {
		listeners.add(c);
	}

	// TODO: Cache
	private void initStore() {
		this.cache = new TreeMap<String, String>();
		loadStore();
		this.internalTime = 0;
	}
	
	private void loadStore() {
		Object rawJSON= null;
		try {
			rawJSON = JSONValue.parse(new BufferedReader(new FileReader("tests.json")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rawJSON != null) {
			JSONArray allRuns = (JSONArray) rawJSON;
			for (Object rawRun : allRuns) {
				JSONObject run = (JSONObject) rawRun;
				String key = (String) run.keySet().iterator().next();
				cache.put(key, (String) run.get(key));
			}
		}
	}

	private void store(String keys, String value) {
		cache.put(keys, value);
	}

	private String restore(String keys) {
		return cache.get(keys);
	}

	private boolean isInStore(String keys) {
		return cache.containsKey(keys);
	}
	
	private static void saveStore() {
		JSONArray allRuns = new JSONArray();
		for (String key : cache.keySet()) {
			JSONObject runRepresentation = new JSONObject();
			runRepresentation.put(key, cache.get(key));
			allRuns.add(runRepresentation);
		}
		System.out.println(allRuns);
		try {
			allRuns.writeJSONString(new FileWriter("tests.json"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private long getCurrentTime() {
	   return System.currentTimeMillis()/1000;
	}

}
