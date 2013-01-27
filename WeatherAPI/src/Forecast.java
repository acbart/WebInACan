import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

import org.json.simple.parser.ParseException;

public class Forecast {
	private Coordinate location;
	private int elevation;
	private String name;
	private ForecastIndex[] indices;
	private int currentTemperature;
	private int currentDewPoint;
	private int currentRelativeHumidity;
	private int windSpeed;
	private int windDirection;
	private int gust;
	private String weather;
	private double visibility;
	private int windChill;

	public String toString() {
		return "Weather["+location+": "+name+"]";
	}


	public Forecast(String json) throws WeatherException {
		try {
			HashMap<String, Object> rawJson = JsonConverter.convertToHashMap(json);

			// "Location" section
			HashMap<String, Object> rawLocation = (HashMap<String, Object>) rawJson.get("location");
			{
				double latitude = Double.parseDouble(rawLocation.get("latitude").toString());
				double longitude= Double.parseDouble(rawLocation.get("longitude").toString());
				this.location = new Coordinate(latitude, longitude);
				this.elevation = Integer.parseInt(rawLocation.get("elevation").toString());
				this.name = rawLocation.get("areaDescription").toString();
			}

			// Forecasts
			HashMap<String, Object> rawTime = (HashMap<String, Object>) rawJson.get("time");
			HashMap<String, Object> rawData = (HashMap<String, Object>) rawJson.get("data");
			Vector<ForecastIndex> forecasts = new Vector<ForecastIndex>(15);
			{
				String[] periodNames = extractStrings(rawTime.get("startPeriodName"));
				Date[] periodTimes = extractDates(rawTime.get("startValidTime"));
				String[] tempLabels = extractStrings(rawTime.get("tempLabel"));
				int[] temperatures = extractInts(rawData.get("temperature"));
				int[] pops = extractInts(rawData.get("pop"));
				String[] weather = extractStrings(rawData.get("weather"));
				URL[] icons = extractUrls(rawData.get("iconLink"));
				String[] text = extractStrings(rawData.get("text"));
				
				for (int i = 0; i < periodNames.length; i+= 1) {
					ForecastIndex fi= new ForecastIndex(periodNames[i]);
					fi.setDate(periodTimes[i]);
					fi.setTemperatureLabel(tempLabels[i]);
					fi.setTemperature(temperatures[i]);
					fi.setProbabilityOfPrecipitation(pops[i]);
					fi.setWeather(weather[i]);
					fi.setIcon(icons[i]);
					fi.setText(text[i]);
					forecasts.add(fi);
				}
			}
			this.indices = new ForecastIndex[forecasts.size()];
			this.indices = forecasts.toArray(this.indices);

			// "Current" section
			HashMap<String, Object> rawCurrent = (HashMap<String, Object>) rawJson.get("currentobservation");
			{
				int currentTemperature = Integer.parseInt(rawCurrent.get("Temp").toString());
				int currentDewPoint = Integer.parseInt(rawCurrent.get("Dewp").toString());
				int currentRelativeHumidity= Integer.parseInt(rawCurrent.get("Relh").toString());
				int windSpeed= Integer.parseInt(rawCurrent.get("Winds").toString());
				int windDirection= Integer.parseInt(rawCurrent.get("Windd").toString());
				int gust= Integer.parseInt(rawCurrent.get("Gust").toString());
				String weather = rawCurrent.get("Weather").toString();
				double visibility = Double.parseDouble(rawCurrent.get("Visibility").toString());
				int windChill = Integer.parseInt(rawCurrent.get("WindChill").toString());
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	private int[] extractInts(Object json) {
		ArrayList<String> stringValues = (ArrayList<String>) json;
		int[] values = new int[stringValues.size()];
		for (int i = 0; i < stringValues.size(); i+= 1) {
			if (stringValues.get(i) == null) {
				// Occasionally, the Probability of Precipitation is 0%
				// The weather service reports this as "null" for your inconvenience
				values[i] = 0;
			} else {
				values[i] = Integer.parseInt(stringValues.get(i));
			}
		}
		return values;
	}
	
	private URL[] extractUrls(Object json) throws WeatherException {
		ArrayList<String> stringValues = (ArrayList<String>) json;
		URL[] values = new URL[stringValues.size()];
		for (int i = 0; i < stringValues.size(); i+= 1) {
			if (stringValues.get(i) == null) {
				values[i] = (URL) null;
			} else {
				try {
					values[i] = new URL(stringValues.get(i));
				} catch (MalformedURLException e) {
					throw new WeatherException("The image URL couldn't be parsed");
				}
			}
		}
		return values;
	}
	
	private String[] extractStrings(Object json) {
		ArrayList<String> stringValues = (ArrayList<String>) json;
		String[] values = new String[stringValues.size()];
		values = stringValues.toArray(values);
		return values;
	}
	
	private Date[] extractDates(Object json) throws WeatherException {
		ArrayList<String> stringValues = (ArrayList<String>) json;
		Date[] values = new Date[stringValues.size()];
		for (int i = 0; i < stringValues.size(); i+= 1) {
			values[i] = null;
			try {
				values[i] = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(stringValues.get(i));
			} catch (java.text.ParseException e) {
				throw new WeatherException("Date couldn't be parsed from the incoming data ("+stringValues.get(i)+").");
			}
		}
		return values;
	}
}
