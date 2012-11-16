
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
}
