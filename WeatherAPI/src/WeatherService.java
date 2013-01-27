import java.io.IOException;
import java.util.Date;


public class WeatherService {
		
		private final static String SERVICE_URL = "http://forecast.weather.gov/MapClick.php";
	
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
		
		public Forecast getWeather(Coordinate location) throws WeatherException {
			String parameters = Requests.makeParameter("lat", location.getLatitude()) + "&" +
								Requests.makeParameter("lon", location.getLongitude()) + "&" +
								Requests.makeParameter("FcstType", "json");
					
			String jsonResponse = "";
			try {
				jsonResponse = Requests.get(SERVICE_URL, parameters);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new Forecast(jsonResponse);
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
