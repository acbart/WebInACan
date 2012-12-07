package searcher;

import java.util.HashMap;
import java.util.Map;

import regular.Util;

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

	@Override
	public Map<String, String> getFilter() {
		HashMap<String, String> filter = new HashMap<String,String>();
		filter.put("location", this.address);
		if (this.hinting) {
			filter.put("cll", Util.formatDecimals(this.latitudeHint, 6)
					+","
					+Util.formatDecimals(this.longitudeHint, 6));
		}
		return filter;
	}
}
