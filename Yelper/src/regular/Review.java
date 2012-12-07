package regular;

import java.util.HashMap;

public class Review {
	private String id;
	private int rating;
	private String ratingImageUrl;
	private String ratingImageUrlSmall;
	private String ratingImageUrlLarge;
	private String excerpt;
	private int timeCreated;
	private User user;
	
	Review(String id, int rating, String ratingImageUrl,
			String ratingImageUrlSmall, String ratingImageUrlLarge,
			String excerpt, int timeCreated, User user) {
		this.id = id;
		this.rating = rating;
		this.ratingImageUrl = ratingImageUrl;
		this.ratingImageUrlSmall = ratingImageUrlSmall;
		this.ratingImageUrlLarge = ratingImageUrlLarge;
		this.excerpt = excerpt;
		this.timeCreated = timeCreated;
		this.user = user;
	}
	
	@SuppressWarnings("unchecked")
	public Review(HashMap<String, Object> raw) {
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @return the ratingImageUrl
	 */
	public String getRatingImageUrl() {
		return ratingImageUrl;
	}
	/**
	 * @return the ratingImageUrlSmall
	 */
	public String getRatingImageUrlSmall() {
		return ratingImageUrlSmall;
	}
	/**
	 * @return the ratingImageUrlLarge
	 */
	public String getRatingImageUrlLarge() {
		return ratingImageUrlLarge;
	}
	/**
	 * @return the excerpt
	 */
	public String getExcerpt() {
		return excerpt;
	}
	/**
	 * @return the timeCreated
	 */
	public int getTimeCreated() {
		return timeCreated;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}	
}
