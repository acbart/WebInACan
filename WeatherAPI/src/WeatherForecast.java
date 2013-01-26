import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;


public class WeatherForecast {
	private Coordinate location;
	private int maxTemperature;
	private int minTemperature;
	private int morningPrecipitation;
	private int eveningPrecipitation;
	private WeatherCondition condition;
	
	
	public String toString() {
		return "Weather["+location+"]";
	}
	

	public WeatherForecast(String rawXML) throws WeatherException {
		SAXBuilder builder = new SAXBuilder();
		
		InputStream xmlInputStream = new ByteArrayInputStream(rawXML.getBytes());

		try {
			Document document = (Document) builder.build(xmlInputStream);
			Element rootNode = document.getRootElement();
			if ("error" == rootNode.getName()) {
				throw new WeatherException(rootNode.getChild("pre").getValue());
			} else {
				rootNode = rootNode.getChild("data");
				
				Element elementLocation = rootNode.getChild("location").getChild("point");
				Double latitude = Double.parseDouble(elementLocation.getAttributeValue("latitude"));
				Double longitude = Double.parseDouble(elementLocation.getAttributeValue("longitude"));
				this.location = new Coordinate(latitude, longitude);
				
				List list = rootNode.getChildren("time-layout");
				
				System.out.println(list);
	
				for (int i = 0; i < list.size(); i++) {
	
					Element node = (Element) list.get(i);
					System.out.println(node.getValue());
	//
	//				System.out.println("First Name : " + node.getChildText("firstname"));
	//				System.out.println("Last Name : " + node.getChildText("lastname"));
	//				System.out.println("Nick Name : " + node.getChildText("nickname"));
	//				System.out.println("Salary : " + node.getChildText("salary"));
	
				}
			}
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		} catch (IOException e) {
			// Why on earth does reading a string possibly throw an IOException?
			// That's complete BS
			System.out.println("There was a fundamental error with the API. Please report this problem and the following stack trace.");
			e.printStackTrace();
		}
	}
}
