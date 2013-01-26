import java.io.IOException;
import java.util.Date;


public class WeatherService {
		
		private final static String SERVICE_URL = "http://graphical.weather.gov/xml/sample_products/browser_interface/ndfdBrowserClientByDay.php";
	
		public static void main(String[] args) {
			WeatherService jw = new WeatherService();
			try {
				System.out.println(jw.getWeather(new Coordinate(40, -77)));
			} catch (WeatherException e) {
				System.out.println(e);
			}
		}
		
		private boolean local = false;
		
		public WeatherService() {
			this.local = false;
		}
		
		public WeatherForecast getWeather(Coordinate location) throws WeatherException {
			String parameters = Requests.makeParameter("lat", location.getLatitude()) + "&" +
								Requests.makeParameter("lon", location.getLongitude()) + "&" +
								Requests.makeParameter("format", "24+hourly");
					
			String xmlData = "";
			try {
				xmlData = Requests.get(SERVICE_URL, parameters);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new WeatherForecast(xmlData);
		}
		
		/**
		 * 
		 * @param local
		 */
		public void setLocal(boolean local) {
			this.local = local;
		}
		
		public boolean getLocal(boolean local) {
			return local;
		}
}
