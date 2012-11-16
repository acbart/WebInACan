package searcher;

public class NamedLocation implements Location {
	private String address;
	private double latitudeHint;
	private double longitudeHint;
	private boolean hinting;
	
	public NamedLocation(String address) {
		this.setAddress(address);
		this.hinting = false;
	}
	
	public NamedLocation(String address, double latitudeHint, double longitudeHint) {
		this.setAddress(address);
		this.setHint(latitudeHint, longitudeHint);
	}
	
	public NamedLocation() {
		this("205 N Main St, Blacksburg, Montgomery, Virginia 24060");
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void removeHint() {
		this.hinting = false;
	}
	
	public void setHint(double latitudeHint, double longitudeHint) {
		this.latitudeHint= latitudeHint;
		this.longitudeHint = longitudeHint;
		this.hinting = true;
	}
	
	public double getLatitudeHint() {
		return latitudeHint;
	}
	
	public double getLongitudeHint() {
		return longitudeHint;
	}
	
	public boolean hasHint() {
		return hinting;
	}
}
