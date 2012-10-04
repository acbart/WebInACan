package weather;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeMap;

import javax.xml.namespace.QName;
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

/**
 * Singleton class for accessing web data.
 * @author acbart
 *
 */
public class Weatherer {
	
	/**
	 * Singleton instance of the class.
	 */
	private static Weatherer instance = null;
	
	/**
	 * Indicates that the web service should not be called, even
	 * if there is no entry in the local cache.
	 */
	private boolean offline = true;
	
	/**
	 * Indicates that the local cache should be skipped in favor of
	 * going directly to the original web service.
	 */
	private boolean direct = false;
	
	/**
	 * The PortType is our connection to the web service, and also holds
	 * a good bit of metainformation about using the auto-generated bindings. 
	 */
	private NdfdXMLBindingStub portBinding;
	
	/**
	 * Maps from a Java class to an XML serializer factory, so given a java
	 * class and namespace, we can create a way to serialize an object into
	 * cross-binding-compliant XML. 
	 */
	private TypeMapping serializerTypeMapping;
	
	/**
	 * The style for encoding that the Serializer will use. Stored for consistency
	 * with TypeMapping, but it could be dynamic. Honestly, I'm not sure if I
	 * should even use this this way. 
	 */
	private String serializerEncodingStyle;
	
	/**
	 * Local constructor, should never be called except by getInstance().
	 */
	protected Weatherer() {
		// Exists only to defeat instantiation
		// Won't work if in the same package or if this class is subclassed
	}
	
	/**
	 * Get the singleton instance of this class in order to make calls.
	 * @return An instance of this class
	 * @throws ServiceException
	 * @throws RemoteException
	 */
	public static Weatherer getInstance() throws ServiceException, RemoteException {
		if (instance == null) {
			instance = new Weatherer();
			instance.initConnectionParameters();
		}
		return instance;
	}
	
	/**
	 * Set up local cache and collect information needed to make web service calls
	 * @throws ServiceException
	 * @throws RemoteException
	 */
	public void initConnectionParameters() throws ServiceException, RemoteException { 
		// Pattern: (new Locator()).getPortType()
		this.portBinding = (NdfdXMLBindingStub)(new NdfdXMLLocator()).getndfdXMLPort();
		// Collect information about serializer
		Call dummyCall = portBinding.createCall();
		this.serializerTypeMapping = dummyCall.getTypeMapping();
		this.serializerEncodingStyle = dummyCall.getEncodingStyle();
		// Load local cache
		initStore();
	}
	
	/**
	 * Stupid and naive method of caching that I'm using just to get started.
	 * It's seriously just a straightup ordered map :)
	 */
	private static TreeMap<String, String> cache;
	
	/**
	 * Simple callback class for running functions asynchronously. If you want
	 * to use a callback, implement one or both functions.
	 * @author acbart
	 *
	 */
	public class Callback {
		public void dataReceived(String data) {}
		public void errorRecieved(IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		try {
			// TODO: command line snapshot generation
			Weatherer wt = new Weatherer();
			
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Consumes an API method call and it's arguments, and converts it into a string
	 * representing a call to the API. The arguments are serialized into XML according
	 * to the default encoding so that they are compatible across different bindings. 
	 * @param method
	 * @param arguments
	 * @return
	 * @throws IOException
	 */
	public String keyifyArguments(String method, Object[] arguments) throws IOException {
		// Get everything we need to know about the methods parameters
		OperationDesc methodDescription = NdfdXMLBindingStub._operations[2];
		// Get everything we need to know to perform mapping
		// Create the output array
		StringWriter key = new StringWriter();
		key.write(method+",");
		// Iterate over parameters to convert them to their XML representation
		int parameterCount = methodDescription.getParameters().size();
		for (int i = 0; i < parameterCount; i += 1) {
			// Collect relevant data about parameter
			Object parameterValue = arguments[i];
			ParameterDesc parameterDescription = methodDescription.getParameter(i);
			Class parameterJavaType = parameterDescription.getJavaType();
			QName parameterQName = parameterDescription.getQName();
			// Build xml serializer for parameter
			SerializerFactory paramaterSerializerFactory = serializerTypeMapping.getSerializer(parameterJavaType, parameterQName);
			org.apache.axis.encoding.Serializer paramaterSerializer = (org.apache.axis.encoding.Serializer) paramaterSerializerFactory.getSerializerAs(serializerEncodingStyle); 
			SerializationContext serializerForKey = new SerializationContext(key);
			// Serialize the argument into xml and add it to the key
			paramaterSerializer.serialize(parameterQName, null, parameterValue, serializerForKey);
			if (i != parameterCount)
				key.write(",");
		}
		// Finally, convert it all a string and return it 
		key.flush();
		return key.toString();
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
				} catch (IOException e) {
					cb.errorRecieved(e);
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
			weather.WeatherParametersType weatherParameters) throws IOException {
		// TODO: listof arguments
		Object[] args = { listLatLon, product, startTime, endTime, unit, weatherParameters };
		// TODO: method name
		String key = keyifyArguments("getQuote", args);

		if (!this.direct && isInStore(key)) {
			return restore(key);
		} else if (!this.offline) {
			// TODO: listof arguments
			String value = this.portBinding.NDFDgenLatLonList(listLatLon, product,
					startTime, endTime, unit, weatherParameters);
			key = getCurrentTime() + "," + key;
			store(key, value);
			return value;
		} else {
			throw new RemoteException();
		}
	}


	// TODO: Cache
	private void initStore() {
		this.cache = new TreeMap<String, String>();
		loadStore();
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
