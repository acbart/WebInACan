
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
}
