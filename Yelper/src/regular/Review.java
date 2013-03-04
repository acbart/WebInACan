package regular;

import java.util.HashMap;

/**
 * TODO
 * @author acbart
 *
 */
public class Review {
	private String id;
	private int rating;
	private String ratingImageUrl;
	private String ratingImageUrlSmall;
	private String ratingImageUrlLarge;
	private String excerpt;
	private int timeCreated;
	private User user;

	
	@SuppressWarnings("unchecked")
	Review(HashMap<String, Object> raw) {
		this.id = (String) raw.get("id");
		this.rating = Integer.parseInt((raw.get("rating").toString()));
		this.ratingImageUrl = (String) raw.get("rating_image_url");
		this.ratingImageUrlSmall = (String) raw.get("rating_image_small_url");
		this.ratingImageUrlLarge = (String) raw.get("rating_image_large_url");
		this.excerpt = (String) raw.get("excerpt");
		this.timeCreated = Integer.parseInt((raw.get("time_created").toString()));
		this.user = new User((HashMap<String, Object>)raw.get("user"));
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
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * TODO
	 * @return the ratingImageUrl
	 */
	public String getRatingImageUrl() {
		return ratingImageUrl;
	}
	/**
	 * TODO
	 * @return the ratingImageUrlSmall
	 */
	public String getRatingImageUrlSmall() {
		return ratingImageUrlSmall;
	}
	/**
	 * TODO
	 * @return the ratingImageUrlLarge
	 */
	public String getRatingImageUrlLarge() {
		return ratingImageUrlLarge;
	}
	/**
	 * TODO
	 * @return the excerpt
	 */
	public String getExcerpt() {
		return excerpt;
	}
	/**
	 * TODO
	 * @return the timeCreated
	 */
	public int getTimeCreated() {
		return timeCreated;
	}
	/**
	 * TODO
	 * @return the user
	 */
	public User getUser() {
		return user;
	}	
}
