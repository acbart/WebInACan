package weather;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;

import weather.NdfdXMLBindingStub;
import weather.NdfdXMLLocator;
import weather.Weatherer.Callback;


public class WeatherConnection {
	
	private NdfdXMLBindingStub portBinding;
	
	public WeatherConnection() {
		try {
			this.portBinding = (NdfdXMLBindingStub)(new NdfdXMLLocator()).getndfdXMLPort();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WeatherConnection wc = new WeatherConnection();
		try {
			System.out.println(wc.makeGetRequest("http://graphical.weather.gov/xml/sample_products/browser_interface/ndfdXMLclient.php", 
					"lat=38.99&lon=-77.01&product=time-series&begin=2004-01-01T00:00:00&end=2013-04-20T00:00:00&maxt=maxt&mint=mint"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String getWeather() {
		java.util.Calendar c1 = java.util.Calendar.getInstance();
		java.util.Calendar c2 = java.util.Calendar.getInstance();
		//c2.add(Calendar.HOUR_OF_DAY, -200);
		try {
			return this.portBinding.NDFDgenLatLonList("38.00,-100,40.00,-78.00",
						new ProductType("glance"),
						c1,
						c2,
						new UnitType("e"),
						new WeatherParametersType());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private String makeGetRequest(String request, String urlParameters) throws IOException {
	    // i.e.: request = "http://example.com/index.php?param1=a&param2=b&param3=c";
		request = request + "?" + urlParameters;
	    URL url = new URL(request); 
	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();           
	    connection.setDoOutput(true); 
	    connection.setInstanceFollowRedirects(false); 
	    connection.setRequestMethod("GET"); 
	    connection.setRequestProperty("Content-Type", "text/plain"); 
	    connection.setRequestProperty("charset", "utf-8");
	    connection.connect();
	    
	    StringBuilder response = new StringBuilder();
	    String line;
	    
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		while ((line = reader.readLine()) != null) {
			response.append(line);
		}
		reader.close();
	    
		connection.disconnect();
		return response.toString();
}
	
	/*public Weather getWeather(CoordinateLocation location) {
		
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
	}*/
}
