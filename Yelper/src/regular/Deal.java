package regular;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
	
	private List<DealOption> options;

	public Deal(HashMap<String, Object> raw) {
		this.id = (String) raw.get("id");
		this.title = (String) raw.get("title");
		this.url = (String) raw.get("url");
		this.imageUrl = (String) raw.get("image_url");
		this.currencyCode = (String) raw.get("currency_code");
		this.timeStart= Integer.parseInt((raw.get("time_start").toString()));
		this.timeEnd= Integer.parseInt((raw.get("time_end").toString()));
		this.isPopular = (boolean) raw.get("is_popular");
		this.details = (String) raw.get("details");
		this.importantRestrictions = (String) raw.get("important_restrictions");
		this.additionalRestrictions = (String) raw.get("additional_restrictions");
		
		if (raw.containsKey("options")) {
			this.options= new ArrayList<DealOption>();
			Iterator<HashMap<String, Object>> d = ((ArrayList<HashMap<String, Object>>) raw.get("options")).iterator();
			while (d.hasNext()) {
				this.options.add(new DealOption(d.next()));
			}
		}
	}

	/**
	 * @return the additionalRestrictions
	 */
	public String getAdditionalRestrictions() {
		return additionalRestrictions;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @return the id
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
	 * @return the importantRestrictions
	 */
	public String getImportantRestrictions() {
		return importantRestrictions;
	}

	/**
	 * @return the options
	 */
	public List<DealOption> getOptions() {
		return options;
	}

	/**
	 * @return the timeEnd
	 */
	public int getTimeEnd() {
		return timeEnd;
	}

	/**
	 * @return the timeStart
	 */
	public int getTimeStart() {
		return timeStart;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the isPopular
	 */
	public boolean isPopular() {
		return isPopular;
	}
}
