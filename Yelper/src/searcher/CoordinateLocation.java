package searcher;

import java.util.HashMap;
import java.util.Map;

import regular.Util;

public class CoordinateLocation implements Location {
	/* 
	TODO: Getters/setters  
	*/
	
	private double latitude;
	private double longitude;
	private double accuracy;
	private double altitude;
	private double altitudeAccuracy;
	
	private boolean hasAccuracy;
	private boolean hasAltitude;
	private boolean hasAltitudeAccuracy;
	
	public boolean hasAccuracy() {
		return hasAccuracy;
	}
	
	public boolean hasAltitude() {
		return hasAltitude;
	}
	
	public boolean hasAltitudeAccuracy() {
		return hasAltitudeAccuracy;
	}
	
	public CoordinateLocation(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.hasAccuracy = false;
		this.hasAltitude = false;
		this.hasAltitudeAccuracy = false;
	}
	
	public CoordinateLocation(double latitude, double longitude, double accuracy) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.accuracy = accuracy;
		this.hasAltitude = false;
		this.hasAltitudeAccuracy = false;
	}
	
	public CoordinateLocation(double latitude, double longitude, double accuracy, double altitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.accuracy = accuracy;
		this.altitude = altitude;
		this.hasAltitudeAccuracy = false;
	}
	
	public CoordinateLocation(double latitude, double longitude, double accuracy, double altitude, double altitudeAccuracy) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.accuracy = accuracy;
		this.altitude = altitude;
		this.altitudeAccuracy = altitudeAccuracy;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the accuracy
	 */
	public double getAccuracy() {
		return accuracy;
	}
	
	/**
	 * Removes the accuracy of the location.
	 */
	public void removeAccuracy() {
		this.hasAccuracy = false;
	}

	/**
	 * @param accuracy the accuracy to set
	 */
	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
		this.hasAccuracy = true;
	}

	/**
	 * @return the altitude
	 */
	public double getAltitude() {
		return altitude;
	}

	/**
	 * @param altitude the altitude to set
	 */
	public void setAltitude(double altitude) {
		this.altitude = altitude;
		this.hasAltitude = true;
	}
	
	public void removeAltitude() {
		this.hasAltitude = false;
		this.hasAltitudeAccuracy = false;
	}
	
	/**
	 * @param altitude the altitude to set
	 */
	public void setAltitude(double altitude, double altitudeAccuracy) {
		this.altitude = altitude;
		this.altitudeAccuracy = altitudeAccuracy;
		this.hasAltitude = true;
		this.hasAltitudeAccuracy = true;
	}

	/**
	 * @return the altitudeAccuracy
	 */
	public double getAltitudeAccuracy() {
		return altitudeAccuracy;
	}
	
	public void removeAltitudeAccuracy() {
		this.hasAltitudeAccuracy= false;
	}

	@Override
	public Map<String, String> getFilter() {
		HashMap<String, String> filters = new HashMap<String,String>();
		String locationString = Util.formatDecimals(latitude, 6)+","+Util.formatDecimals(longitude,6);
		if (this.hasAccuracy) {
			locationString+= "," + Util.formatDecimals(this.accuracy,6);
		}
		if (this.hasAltitude) {
			locationString+= "," + Util.formatDecimals(this.altitude,6);
		}
		if (this.hasAltitudeAccuracy) {
			locationString+= "," + Util.formatDecimals(this.altitudeAccuracy,6);
		}
		filters.put("ll", locationString);
		return filters;
	}
}
