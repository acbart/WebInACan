import java.util.List;


public class Business {

	private String id;
	private boolean isClaimed;
	private boolean isClosed;
	private String name;
	private String imageUrl;
	private String url;
	private String mobileUrl;
	private String phone;
	private String displayPhone;
	private int review_count;
	private List<BusinessCategory> categories;
	private int distance;
	private int ratingdistance;
	private String ratingImageUrl;
	private String ratingImageUrlSmall;
	private String ratingImageUrlLarge;
	private String snippetText;
	private String snippetImageUrl;
	private DetailedLocation location;
	private List<Deal> deals;
	private List<GiftCertificates> giftCertificates;
	private List<Review> reviews;
	/**
	 * @return The unique id for this business, a string of alphanumeric characters. 
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the isClaimed
	 */
	public boolean isClaimed() {
		return isClaimed;
	}
	/**
	 * @param isClaimed the isClaimed to set
	 */
	public void setClaimed(boolean isClaimed) {
		this.isClaimed = isClaimed;
	}
	/**
	 * @return the isClosed
	 */
	public boolean isClosed() {
		return isClosed;
	}
	/**
	 * @param isClosed the isClosed to set
	 */
	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the mobileUrl
	 */
	public String getMobileUrl() {
		return mobileUrl;
	}
	/**
	 * @param mobileUrl the mobileUrl to set
	 */
	public void setMobileUrl(String mobileUrl) {
		this.mobileUrl = mobileUrl;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the displayPhone
	 */
	public String getDisplayPhone() {
		return displayPhone;
	}
	/**
	 * @param displayPhone the displayPhone to set
	 */
	public void setDisplayPhone(String displayPhone) {
		this.displayPhone = displayPhone;
	}
	/**
	 * @return the review_count
	 */
	public int getReview_count() {
		return review_count;
	}
	/**
	 * @param review_count the review_count to set
	 */
	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}
	/**
	 * @return the categories
	 */
	public List<BusinessCategory> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<BusinessCategory> categories) {
		this.categories = categories;
	}
	/**
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}
	/**
	 * @return the ratingdistance
	 */
	public int getRatingdistance() {
		return ratingdistance;
	}
	/**
	 * @param ratingdistance the ratingdistance to set
	 */
	public void setRatingdistance(int ratingdistance) {
		this.ratingdistance = ratingdistance;
	}
	/**
	 * @return the ratingImageUrl
	 */
	public String getRatingImageUrl() {
		return ratingImageUrl;
	}
	/**
	 * @param ratingImageUrl the ratingImageUrl to set
	 */
	public void setRatingImageUrl(String ratingImageUrl) {
		this.ratingImageUrl = ratingImageUrl;
	}
	/**
	 * @return the ratingImageUrlSmall
	 */
	public String getRatingImageUrlSmall() {
		return ratingImageUrlSmall;
	}
	/**
	 * @param ratingImageUrlSmall the ratingImageUrlSmall to set
	 */
	public void setRatingImageUrlSmall(String ratingImageUrlSmall) {
		this.ratingImageUrlSmall = ratingImageUrlSmall;
	}
	/**
	 * @return the ratingImageUrlLarge
	 */
	public String getRatingImageUrlLarge() {
		return ratingImageUrlLarge;
	}
	/**
	 * @param ratingImageUrlLarge the ratingImageUrlLarge to set
	 */
	public void setRatingImageUrlLarge(String ratingImageUrlLarge) {
		this.ratingImageUrlLarge = ratingImageUrlLarge;
	}
	/**
	 * @return the snippetText
	 */
	public String getSnippetText() {
		return snippetText;
	}
	/**
	 * @param snippetText the snippetText to set
	 */
	public void setSnippetText(String snippetText) {
		this.snippetText = snippetText;
	}
	/**
	 * @return the snippetImageUrl
	 */
	public String getSnippetImageUrl() {
		return snippetImageUrl;
	}
	/**
	 * @param snippetImageUrl the snippetImageUrl to set
	 */
	public void setSnippetImageUrl(String snippetImageUrl) {
		this.snippetImageUrl = snippetImageUrl;
	}
	/**
	 * @return the location
	 */
	public DetailedLocation getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(DetailedLocation location) {
		this.location = location;
	}
	/**
	 * @return the deals
	 */
	public List<Deal> getDeals() {
		return deals;
	}
	/**
	 * @param deals the deals to set
	 */
	public void setDeals(List<Deal> deals) {
		this.deals = deals;
	}
	/**
	 * @return the giftCertificates
	 */
	public List<GiftCertificates> getGiftCertificates() {
		return giftCertificates;
	}
	/**
	 * @param giftCertificates the giftCertificates to set
	 */
	public void setGiftCertificates(List<GiftCertificates> giftCertificates) {
		this.giftCertificates = giftCertificates;
	}
	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}
	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
