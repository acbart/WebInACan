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
import javax.xml.rpc.encoding.DeserializerFactory;
import javax.xml.rpc.encoding.SerializerFactory;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.client.Call;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializationContext;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.TypeMapping;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.xml.sax.SAXException;

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
	private boolean offline = false;

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
		/**
		 * Callback that is called when a call to the web service (or cache) is
		 * finished successfully. "data" will need to be cast to something more
		 * useful.
		 * @param data
		 */
		public void dataReceived(Object data) {}
		/**
		 * Callback that is called when a call to the web service (or cache)
		 * fails. There could be several reasons why.
		 * @param e
		 */
		public void errorRecieved(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param args
	 * @throws SAXException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws SAXException {
		try {
			// TODO: command line snapshot generation
			Weatherer wt = null;
			try {
				wt = getInstance();
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

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
		} catch (Exception e) {
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
	public String keyifyArguments(int operationIndex, Object[] arguments) throws IOException {
		// Get everything we need to know about the methods parameters
		OperationDesc methodDescription = NdfdXMLBindingStub._operations[operationIndex];
		// Create the output string
		StringWriter key = new StringWriter();
		key.write(methodDescription.getName()+",");
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
	
	private String valuifyReturn(int operationIndex, Object returnValue) throws IOException {
		// Create the output string
		StringWriter value = new StringWriter();
		// Get everything we need to know about the method's return
		OperationDesc methodDescription = NdfdXMLBindingStub._operations[operationIndex];
		Class returnJavaType = methodDescription.getReturnClass();
		QName returnQName = methodDescription.getReturnQName();
		SerializerFactory returnSerializerFactory = serializerTypeMapping.getSerializer(returnJavaType, returnQName);
		org.apache.axis.encoding.Serializer returnSerializer = (org.apache.axis.encoding.Serializer) returnSerializerFactory.getSerializerAs(serializerEncodingStyle); 
		SerializationContext serializerForValue= new SerializationContext(value);
		// Serialize the argument into xml and add it to the key
		returnSerializer.serialize(returnQName, null, returnValue, serializerForValue);
		value.flush();
		return value.toString();
	}
	
	private Object devaluifyReturn(int operationIndex, String serializedValue) throws Exception {
		// Get everything we need to know about the method's return
		OperationDesc methodDescription = NdfdXMLBindingStub._operations[operationIndex];
		Class returnJavaType = methodDescription.getReturnClass();
		QName returnQName = methodDescription.getReturnType();
		DeserializerFactory returnDeserializerFactory = serializerTypeMapping.getDeserializer(returnJavaType, returnQName);
		org.apache.axis.encoding.Deserializer returnDeserializer = (org.apache.axis.encoding.Deserializer) returnDeserializerFactory.getDeserializerAs(serializerEncodingStyle);
		MessageContext ct = new MessageContext(null);
		DeserializationContext deserializerForValue= new DeserializationContext(null, ct, serializedValue);
		deserializerForValue.parse();
		System.out.println("Value: "+deserializerForValue.getCurElement());
		// Serialize the argument into xml and add it to the key
		return returnDeserializer.getValue(serializedValue);
	}

	/**
	 * <Match signature for original function>
	 * 
	 * This call will be performed synchronously - that is, execution will continue
	 * while it is being made. Implement the callback parameter to have something
	 * happen when the call is finished (either by success or failure).
	 * @param listLatLon
	 * @param product
	 * @param startTime
	 * @param endTime
	 * @param unit
	 * @param weatherParameters
	 * @param cb
	 * @throws RemoteException
	 */
	public void NDFDgenLatLonList(final java.lang.String listLatLon, 
			final weather.ProductType product, 
			final java.util.Calendar startTime, 
			final java.util.Calendar endTime, 
			final weather.UnitType unit, 
			final weather.WeatherParametersType weatherParameters,
			final Callback cb) throws RemoteException {
		Thread thread = new Thread() {
			public void run() {
				try {
					String result = NDFDgenLatLonList(listLatLon, 
							product, 
							startTime, 
							endTime, 
							unit, 
							weatherParameters);
					cb.dataReceived(result);
				} catch (Exception e) {
					cb.errorRecieved(e);
				}
			}
		};
		thread.start();
	}

	/**
	 * <Match signature for original function>
	 * 
	 * This function will be performed synchronously - that is, execution will pause until
	 * the call is finished, whether it ends in success or failure.
	 * 
	 * @param listLatLon
	 * @param product
	 * @param startTime
	 * @param endTime
	 * @param unit
	 * @param weatherParameters
	 * @return
	 * @throws Exception 
	 */
	public String NDFDgenLatLonList(java.lang.String listLatLon, 
			weather.ProductType product, 
			java.util.Calendar startTime, 
			java.util.Calendar endTime, 
			weather.UnitType unit, 
			weather.WeatherParametersType weatherParameters) throws Exception {
		// Create a key corresponding to this method invocation
		Object[] args = { listLatLon, product, startTime, endTime, unit, weatherParameters };
		String key = keyifyArguments(2, args);

		// if we're using the store and the key is present, retrieve it's value
		if (!this.direct && isInStore(key)) {
			return restore(key);
		// else if we're not offline, go retreive the value from the web service
		} else if (!this.offline) {
			String value = this.portBinding.NDFDgenLatLonList(listLatLon, product,
					startTime, endTime, unit, weatherParameters);
			key = getCurrentTime() + "," + key;
			System.out.println(valuifyReturn(2, value));
			System.out.println(devaluifyReturn(2, valuifyReturn(2, value)));
			store(key, valuifyReturn(2, value));
			return value;
		// otherwise we're hosed!
		} else {
			throw new RemoteException();
		}
	}


	/**
	 * Rudimentary attempt at caching, it's really just a treemap that we
	 * store as a JSON file on disk
	 */
	private void initStore() {
		this.cache = new TreeMap<String, String>();
		loadStore();
	}

	/**
	 * Rudimentary attempt at caching. We load a JSON file representing the cache
	 * from disk at the start. More thought needs to go into it's structure
	 * [{'time,method,*args' : value} # run 1,
	 * 	{'time,method,*args' : value} # run 2] 
	 */
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

	/**
	 * Rudimentary attempt at caching. 
	 * Stores the key-value pair.
	 * @param keys
	 * @param value
	 */
	private void store(String keys, String value) {
		cache.put(keys, value);
	}

	/**
	 * Rudimentary attempt at caching.
	 * Return a value given a key.
	 * @param keys
	 * @param value
	 */
	private String restore(String keys) {
		return cache.get(keys);
	}

	/**
	 * Rudimentary attempt at caching.
	 * Checks if there is a given key in the store.
	 * @param keys
	 * @param value
	 */
	private boolean isInStore(String keys) {
		return cache.containsKey(keys);
	}

	/**
	 * Rudimentary attempt at caching.
	 * Writes the map out to disk as a JSON file.
	 * @param keys
	 * @param value
	 */
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

	/**
	 * Returns the current epoch time in seconds.
	 * @return
	 */
	private long getCurrentTime() {
		return System.currentTimeMillis()/1000;
	}

}
