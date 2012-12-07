package regular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GiftCertificate {
	private String id;
	private String url;
	private String imageUrl;
	private String currencyCode;
	private String unusedBalances;
	private List<GiftCertificateOption> options;
	
	
	public GiftCertificate(HashMap<String, Object> raw) {
		this.id= (String) raw.get("id");
		this.url = (String) raw.get("url");
		this.imageUrl= (String) raw.get("image_url");
		this.currencyCode = (String) raw.get("currency_code");
		this.unusedBalances = (String) raw.get("unused_balance");
		
		if (raw.containsKey("options")) {
			this.options= new ArrayList<GiftCertificateOption>();
			Iterator<HashMap<String, Object>> o = ((ArrayList<HashMap<String, Object>>) raw.get("options")).iterator();
			while (o.hasNext()) {
				this.options.add(new GiftCertificateOption(o.next()));
			}
		}
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}
	/**
	 * @return the unusedBalances
	 */
	public String getUnusedBalances() {
		return unusedBalances;
	}
	/**
	 * @return the options
	 */
	public List<GiftCertificateOption> getOptions() {
		return options;
	}

}
