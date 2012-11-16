package Classy;
import java.util.List;


public class Deal {
	private String id;
	private String title;
	private String url;
	private String imageUrl;
	private String currencyCode;
	private int timeStart;
	private int timeEnd;
	private boolean isPopular;
	private String details;
	private String importantRestrictions;
	private String additionalRestrictions;
	
	private List<DealOptions> options;

	/**
	 * @return the id
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
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the timeStart
	 */
	public int getTimeStart() {
		return timeStart;
	}

	/**
	 * @param timeStart the timeStart to set
	 */
	public void setTimeStart(int timeStart) {
		this.timeStart = timeStart;
	}

	/**
	 * @return the timeEnd
	 */
	public int getTimeEnd() {
		return timeEnd;
	}

	/**
	 * @param timeEnd the timeEnd to set
	 */
	public void setTimeEnd(int timeEnd) {
		this.timeEnd = timeEnd;
	}

	/**
	 * @return the isPopular
	 */
	public boolean isPopular() {
		return isPopular;
	}

	/**
	 * @param isPopular the isPopular to set
	 */
	public void setPopular(boolean isPopular) {
		this.isPopular = isPopular;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * @return the importantRestrictions
	 */
	public String getImportantRestrictions() {
		return importantRestrictions;
	}

	/**
	 * @param importantRestrictions the importantRestrictions to set
	 */
	public void setImportantRestrictions(String importantRestrictions) {
		this.importantRestrictions = importantRestrictions;
	}

	/**
	 * @return the additionalRestrictions
	 */
	public String getAdditionalRestrictions() {
		return additionalRestrictions;
	}

	/**
	 * @param additionalRestrictions the additionalRestrictions to set
	 */
	public void setAdditionalRestrictions(String additionalRestrictions) {
		this.additionalRestrictions = additionalRestrictions;
	}

	/**
	 * @return the options
	 */
	public List<DealOptions> getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(List<DealOptions> options) {
		this.options = options;
	}
}
