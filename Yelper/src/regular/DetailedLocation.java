package regular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import main.GeoAccuracy;
import main.Location;

import util.Util;

/**
 * A location that contains highly detailed information, including both the
 * latitude/longitude coordinates and address.
 * 
 * @author acbart
 * 
 */
public class DetailedLocation implements Location {

	private double latitude;
	private double longitude;
	private ArrayList<String> address;
	private ArrayList<String> displayAddress;
	private String city;
	private String stateCode;
	private String postalCode;
	private String countryCode;
	private String crossStreets;
	private ArrayList<String> neighborhoods;
	private GeoAccuracy geoAccuracy;


	/** TODO
	 * 
	 * @param latitude
	 * @param longitude
	 * @param address
	 * @param displayAddress
	 * @param city
	 * @param stateCode
	 * @param postalCode
	 * @param countryCode
	 * @param crossStreets
	 * @param neighborhoods
	 * @param geoAccuracy
	 */
	DetailedLocation(double latitude, double longitude,
			ArrayList<String> address, ArrayList<String> displayAddress,
			String city, String stateCode, String postalCode,
			String countryCode, String crossStreets,
			ArrayList<String> neighborhoods, GeoAccuracy geoAccuracy) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.displayAddress = displayAddress;
		this.city = city;
		this.stateCode = stateCode;
		this.postalCode = postalCode;
		this.countryCode = countryCode;
		this.crossStreets = crossStreets;
		this.neighborhoods = neighborhoods;
		this.geoAccuracy = geoAccuracy;
	}

	/**
	 * TODO
	 * 
	 * @param hashMap
	 */
	@SuppressWarnings("unchecked")
	DetailedLocation(HashMap<String, Object> hashMap) {
		HashMap<String, Object> coordinates = (HashMap<String, Object>) hashMap
				.get("coordinate");
		this.latitude = Double.parseDouble((coordinates.get("latitude")
				.toString()));
		this.longitude = Double.parseDouble((coordinates.get("longitude")
				.toString()));

		this.address = (ArrayList<String>) hashMap.get("address");
		this.displayAddress = (ArrayList<String>) hashMap
				.get("display_address");

		this.city = (String) hashMap.get("city");
		this.stateCode = (String) hashMap.get("state_code");
		this.postalCode = (String) hashMap.get("postal_code");
		this.countryCode = (String) hashMap.get("country_code");
		this.crossStreets = (String) hashMap.get("cross_streets");
		this.neighborhoods = (ArrayList<String>) hashMap.get("neighborhoods");

		this.geoAccuracy = GeoAccuracy.values()[(Integer.parseInt((hashMap
				.get("geo_accuracy").toString())))];
	}

	/**
	 * TODO
	 */
	public String toString() {
		return Arrays.deepToString(this.address.toArray()).toString();
	}

	/**
	 * TODO
	 * 
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * TODO
	 * 
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * TODO
	 * 
	 * @return the address
	 */
	public ArrayList<String> getAddress() {
		return address;
	}

	/**
	 * TODO
	 * 
	 * @return the displayAddress
	 */
	public ArrayList<String> getDisplayAddress() {
		return displayAddress;
	}

	/**
	 * TODO
	 * 
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * TODO
	 * 
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * TODO
	 * 
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * TODO
	 * 
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * TODO
	 * 
	 * @return the crossStreets
	 */
	public String getCrossStreets() {
		return crossStreets;
	}

	/**
	 * TODO
	 * 
	 * @return the neighborhoods
	 */
	public ArrayList<String> getNeighborhoods() {
		return neighborhoods;
	}

	/**
	 * TODO
	 * 
	 * @return the geoAccuracy
	 */
	public GeoAccuracy getGeoAccuracy() {
		return geoAccuracy;
	}

	/**
	 * TODO
	 */
	@Override
	public Map<String, String> getFilter() {
		HashMap<String, String> filter = new HashMap<String, String>();
		String namedLocation = Util.join(this.address);
		filter.put("location", namedLocation);
		filter.put(
				"cll",
				Util.formatDecimals(this.latitude, 6) + ","
						+ Util.formatDecimals(this.longitude, 6));
		return filter;
	}
}
