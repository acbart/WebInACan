import org.jdom2.Element;


public class WeatherException extends Exception {
	
	private String error;

	public WeatherException(String error) {
		this.error = error;
	}
	
	public String toString() {
		return "Weather Exception: "+this.error;
	}

}
