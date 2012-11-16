package Classy;

public class DealOptions {
	private String title;
	private String purchaseUrl;
	private int price; // in cents
	private String priceFormatted;
	private int originalPrice;
	private String originalPriceFormatted;
	private boolean isQuantityLimited;
	private int remainingCount;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the purchaseUrl
	 */
	public String getPurchaseUrl() {
		return purchaseUrl;
	}
	/**
	 * @param purchaseUrl the purchaseUrl to set
	 */
	public void setPurchaseUrl(String purchaseUrl) {
		this.purchaseUrl = purchaseUrl;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the priceFormatted
	 */
	public String getPriceFormatted() {
		return priceFormatted;
	}
	/**
	 * @param priceFormatted the priceFormatted to set
	 */
	public void setPriceFormatted(String priceFormatted) {
		this.priceFormatted = priceFormatted;
	}
	/**
	 * @return the originalPrice
	 */
	public int getOriginalPrice() {
		return originalPrice;
	}
	/**
	 * @param originalPrice the originalPrice to set
	 */
	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}
	/**
	 * @return the originalPriceFormatted
	 */
	public String getOriginalPriceFormatted() {
		return originalPriceFormatted;
	}
	/**
	 * @param originalPriceFormatted the originalPriceFormatted to set
	 */
	public void setOriginalPriceFormatted(String originalPriceFormatted) {
		this.originalPriceFormatted = originalPriceFormatted;
	}
	/**
	 * @return the isQuantityLimited
	 */
	public boolean isQuantityLimited() {
		return isQuantityLimited;
	}
	/**
	 * @param isQuantityLimited the isQuantityLimited to set
	 */
	public void setQuantityLimited(boolean isQuantityLimited) {
		this.isQuantityLimited = isQuantityLimited;
	}
	/**
	 * @return the remainingCount
	 */
	public int getRemainingCount() {
		return remainingCount;
	}
	/**
	 * @param remainingCount the remainingCount to set
	 */
	public void setRemainingCount(int remainingCount) {
		this.remainingCount = remainingCount;
	}
}
