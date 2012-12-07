package regular;

import java.util.ArrayList;

class ToStringHelper {
	private String name;
	private ArrayList<String> properties;
	public ToStringHelper(String name) {
		this.name = name;
		this.properties = new ArrayList<String>();
	}
	public ToStringHelper add(String property, String value) {
		this.properties.add(property+ "="+ value);
		return this;
	}
	
	public String toString() {
		return name + "{"+ Util.join(", ", properties) +"}";
	}
}
