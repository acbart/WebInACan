package regular;

import java.util.HashMap;

/**
 * TODO
 * @author acbart
 *
 */
public class User {
	private String id;
	private String imageUrl;
	private String name;
	
	User(String id, String imageUrl, String name) {
		this.id = id;
		this.imageUrl = imageUrl;
		this.name = name;
	}
	
	User(HashMap<String, Object> raw) {
		this.id = (String) raw.get("id");
		this.imageUrl = (String) raw.get("image_url");
		this.name = (String) raw.get("name");
	}
	/**
	 * TODO
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * TODO
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * TODO
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
