package searcher;

import java.util.HashMap;
import java.util.Map;

import regular.Util;

public class RectangularLocation implements Location {
	private double swLatitude;
	private double swLongitude;
	private double neLatitude;
	private double neLongitude;
	
	/**
	 * Specifies a rectangular bounding box
	 * @param southwestLatitude The y-component of the lower-leftmost part of the box
	 * @param southwestLongitude The x-component of the lower-leftmost part of the box
	 * @param northeastLatitudeThe y-component of the upper-rightmost part of the box
	 * @param northeastLongitude The x-component of the upper-rightmost part of the box
	 */
	public RectangularLocation(double southwestLatitude,
							 double southwestLongitude,
							 double northeastLatitude,
							 double northeastLongitude) {
		this.setSwLatitude(southwestLatitude);
		this.setNeLatitude(northeastLatitude);
		this.setSwLongitude(southwestLongitude);
		this.setNeLongitude(northeastLongitude);
	}
	
	public RectangularLocation() {
		this(37.2,-80.4,37.3,-80.5);
	}

	public double getSwLatitude() {
		return swLatitude;
	}

	public void setSwLatitude(double swLatitude) {
		this.swLatitude = swLatitude;
	}

	public double getSwLongitude() {
		return swLongitude;
	}

	public void setSwLongitude(double swLongitude) {
		this.swLongitude = swLongitude;
	}

	public double getNeLatitude() {
		return neLatitude;
	}

	public void setNeLatitude(double neLatitude) {
		this.neLatitude = neLatitude;
	}

	public double getNeLongitude() {
		return neLongitude;
	}

	public void setNeLongitude(double neLongitude) {
		this.neLongitude = neLongitude;
	}

	@Override
	public Map<String, String> getFilter() {
		HashMap<String, String> filter = new HashMap<String,String>();
		String sw = Util.formatDecimals(this.swLatitude,6)+","+Util.formatDecimals(this.swLongitude,6);
		String ne = Util.formatDecimals(this.neLatitude,6)+","+Util.formatDecimals(this.neLongitude,6);
		filter.put("bounds", sw + "|" + ne);
		return filter;
	}
	
	public RectangularLocation center(double latitude, double longitude, double latitudeDelta, double longitudeDelta) {
		System.out.println(latitude + " : " + longitude + " : "+ latitudeDelta + " : " + longitudeDelta);
		this.swLatitude = latitude - latitudeDelta / 2.0;
		this.swLongitude = longitude - longitudeDelta / 2.0;
		this.neLatitude = latitude + latitudeDelta / 2.0;
		this.neLongitude = longitude + longitudeDelta / 2.0;
		return this;
	}
	
	public double getLatitudeCenter() {
		return (this.swLatitude + this.neLatitude) / 2.0;
	}
	
	public double getLongitudeCenter() {
		return (this.swLongitude + this.neLongitude) / 2.0;
	}
	
	public double getLatitudeDelta() {
		return Math.abs(this.swLatitude - this.neLatitude);
	}
	
	public double getLongitudeDelta() {
		return Math.abs(this.swLongitude - this.neLongitude);
	}

	public RectangularLocation center(HashMap<String, Object> region) {
		HashMap<String, Object> center = (HashMap<String, Object>) region.get("center");
		HashMap<String, Object> span = (HashMap<String, Object>) region.get("span");
		double latitude = (double) center.get("latitude");
		double longitude = (double) center.get("longitude");
		double latitudeDelta = (double) span.get("latitude_delta");
		double longitudeDelta = (double) span.get("longitude_delta");
		return this.center(latitude, longitude, latitudeDelta, longitudeDelta);
	}
	
	public CoordinateLocation getCenter() {
		return new CoordinateLocation(getLatitudeCenter(), getLongitudeCenter());
	}
	
}
