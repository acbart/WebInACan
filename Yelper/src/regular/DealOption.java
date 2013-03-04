package regular;

import java.util.HashMap;

/**
 * TODO
 * @author acbart
 *
 */
public class DealOption {
	private String title;
	private String purchaseUrl;
	private int price; // in cents
	private String priceFormatted;
	private int originalPrice;
	private String originalPriceFormatted;
	private boolean isQuantityLimited;
	private int remainingCount;
	public DealOption(HashMap<String, Object> raw) {
		this.title = (String) raw.get("title");
		this.purchaseUrl = (String) raw.get("purchase_url");
		this.price = Integer.parseInt((raw.get("price").toString()));
		this.priceFormatted = (String) raw.get("formatted_price");
		this.originalPrice = Integer.parseInt((raw.get("original_price").toString()));
		this.originalPriceFormatted = (String) raw.get("formatted_original_price");
		this.isQuantityLimited = (boolean) raw.get("is_quantity_limited");
		this.remainingCount = Integer.parseInt((raw.get("remaining_count").toString()));
	}
	/**
	 * TODO
	 * @return the originalPrice
	 */
	public int getOriginalPrice() {
		return originalPrice;
	}
	/**
	 * TODO
	 * @return the originalPriceFormatted
	 */
	public String getOriginalPriceFormatted() {
		return originalPriceFormatted;
	}
	/**
	 * TODO
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * TODO
	 * @return the priceFormatted
	 */
	public String getPriceFormatted() {
		return priceFormatted;
	}
	/**
	 * TODO
	 * @return the purchaseUrl
	 */
	public String getPurchaseUrl() {
		return purchaseUrl;
	}
	/**
	 * TODO
	 * @return the remainingCount
	 */
	public int getRemainingCount() {
		return remainingCount;
	}
	/**
	 * TODO
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * TODO
	 * @return the isQuantityLimited
	 */
	public boolean isQuantityLimited() {
		return isQuantityLimited;
	}
}
