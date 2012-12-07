package searcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import regular.Util;


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

	public DetailedLocation(HashMap<String, Object> hashMap) {
		HashMap<String, Object> coordinates = (HashMap<String, Object>) hashMap.get("coordinate");
		this.latitude = Double.parseDouble((coordinates.get("latitude").toString()));
		this.longitude= Double.parseDouble((coordinates.get("longitude").toString()));
		
		this.address = (ArrayList<String>) hashMap.get("address");
		this.displayAddress= (ArrayList<String>) hashMap.get("display_address");
		
		this.city = (String) hashMap.get("city");
		this.stateCode = (String) hashMap.get("state_code");
		this.postalCode = (String) hashMap.get("postal_code");
		this.countryCode = (String) hashMap.get("country_code");
		this.crossStreets = (String) hashMap.get("cross_streets");
		this.neighborhoods = (ArrayList<String>) hashMap.get("neighborhoods");
		
		this.geoAccuracy= GeoAccuracy.values()[(Integer.parseInt((hashMap.get("geo_accuracy").toString())))];
	}

	public String toString() {
		return Arrays.deepToString(this.address.toArray()).toString();
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @return the address
	 */
	public ArrayList<String> getAddress() {
		return address;
	}

	/**
	 * @return the displayAddress
	 */
	public ArrayList<String> getDisplayAddress() {
		return displayAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @return the crossStreets
	 */
	public String getCrossStreets() {
		return crossStreets;
	}

	/**
	 * @return the neighborhoods
	 */
	public ArrayList<String> getNeighborhoods() {
		return neighborhoods;
	}

	/**
	 * @return the geoAccuracy
	 */
	public GeoAccuracy getGeoAccuracy() {
		return geoAccuracy;
	}

	@Override
	public Map<String, String> getFilter() {
		HashMap<String, String> filter = new HashMap<String,String>();
		String namedLocation = Util.join(this.address);
		filter.put("location", namedLocation);
		filter.put("cll", Util.formatDecimals(this.latitude, 6)
				+","
				+Util.formatDecimals(this.longitude, 6));
		return filter;
	}
}
