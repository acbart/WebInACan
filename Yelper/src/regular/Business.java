package regular;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import searcher.BusinessCategory;
import searcher.DetailedLocation;

/**
 * A Business object represents a Business in the real world. 
 * It has a large number of properties associated with it to 
 * describe the Business.
 * @author acbart
 *
 */
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
	private int reviewCount;
	private List<BusinessCategory> categories;
	private double distance;
	private float rating;
	private String ratingImageUrl;
	private String ratingImageUrlSmall;
	private String ratingImageUrlLarge;
	private String snippetText;
	private String snippetImageUrl;
	private DetailedLocation location;
	private List<Deal> deals;
	private List<GiftCertificate> giftCertificates;
	private List<Review> reviews;
	
	@SuppressWarnings("unchecked")
	Business(Map<String, Object> raw) {
		this.id = (String) raw.get("id");
		this.isClaimed = (boolean) raw.get("is_claimed");
		this.isClosed = (boolean) raw.get("is_closed");
		this.name = (String) raw.get("name");
		this.imageUrl = (String) raw.get("image_url");
		this.url = (String) raw.get("url");
		this.mobileUrl = (String) raw.get("mobile_url");
		this.phone = (String) raw.get("phone");
		this.displayPhone= (String) raw.get("display_phone");
		this.reviewCount = Integer.parseInt((raw.get("review_count").toString()));
		
		this.categories = new ArrayList<BusinessCategory>();
		if (raw.get("categories") != null) {
			Iterator<ArrayList<String>> i = ((ArrayList<ArrayList<String>>) raw.get("categories")).iterator();
			while (i.hasNext()) {
				this.categories.add(new BusinessCategory(i.next()));
			}
		}
		
		if (raw.containsKey("distance")) {
			this.distance = Double.parseDouble((raw.get("distance").toString()));
		} else {
			this.distance = -1;
		}
		this.rating= Float.parseFloat((raw.get("rating").toString()));
		
		this.ratingImageUrl = (String) raw.get("rating_image_url");
		this.ratingImageUrlSmall = (String) raw.get("rating_image_url_small");
		this.ratingImageUrlLarge = (String) raw.get("rating_image_url_large");
		this.snippetText = (String) raw.get("snippet_text");
		this.snippetImageUrl = (String) raw.get("snippet_image_url");
		this.location = new DetailedLocation((HashMap<String, Object>)raw.get("location"));
		
		//this.deals = new
		if (raw.containsKey("deals")) {
			this.deals = new ArrayList<Deal>();
			Iterator<HashMap<String, Object>> d = ((ArrayList<HashMap<String, Object>>) raw.get("deals")).iterator();
			while (d.hasNext()) {
				this.deals.add(new Deal(d.next()));
			}
		}
		
		if (raw.containsKey("gift_certificates")) {
			this.giftCertificates = new ArrayList<GiftCertificate>();
			Iterator<HashMap<String, Object>> g = ((ArrayList<HashMap<String, Object>>) raw.get("gift_certificates")).iterator();
			while (g.hasNext()) {
				this.giftCertificates.add(new GiftCertificate(g.next()));
			}
		}
		
		if (raw.containsKey("reviews")) {
			this.reviews = new ArrayList<Review>();
			Iterator<HashMap<String, Object>> r = ((ArrayList<HashMap<String, Object>>) raw.get("reviews")).iterator();
			while (r.hasNext()) {
				this.reviews.add(new Review(r.next()));
			}
		}
	}
	
	public String toString() {
		return (new ToStringHelper("Business"))
				.add("id", this.id.toString())
				.add("name", this.name.toString())
				.toString();
	}
	
	/**
	 * @return the categories
	 */
	public List<BusinessCategory> getCategories() {
		return categories;
	}
	/**
	 * @return the deals
	 */
	public List<Deal> getDeals() {
		return deals;
	}
	/**
	 * @return the displayPhone
	 */
	public String getDisplayPhone() {
		return displayPhone;
	}
	/**
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}
	/**
	 * @return the giftCertificates
	 */
	public List<GiftCertificate> getGiftCertificates() {
		return giftCertificates;
	}
	/**
	 * @return The unique id for this business, a string of characters (e.g. '5Ji5L2GF0ppuwVyC_ET6mg', 'uyrIgOpomZhXXbYHPx951w'). 
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @return the location
	 */
	public DetailedLocation getLocation() {
		return location;
	}
	/**
	 * @return the mobileUrl
	 */
	public String getMobileUrl() {
		return mobileUrl;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @return the ratingImageUrl
	 */
	public String getRatingImageUrl() {
		return ratingImageUrl;
	}
	/**
	 * @return the ratingImageUrlLarge
	 */
	public String getRatingImageUrlLarge() {
		return ratingImageUrlLarge;
	}
	/**
	 * @return the ratingImageUrlSmall
	 */
	public String getRatingImageUrlSmall() {
		return ratingImageUrlSmall;
	}
	/**
	 * @return the review_count
	 */
	public int getReview_count() {
		return reviewCount;
	}
	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}
	/**
	 * @return the snippetImageUrl
	 */
	public String getSnippetImageUrl() {
		return snippetImageUrl;
	}
	/**
	 * @return the snippetText
	 */
	public String getSnippetText() {
		return snippetText;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @return the isClaimed
	 */
	public boolean isClaimed() {
		return isClaimed;
	}
	/**
	 * @return the isClosed
	 */
	public boolean isClosed() {
		return isClosed;
	}
}
