package regular;

import java.util.HashMap;

public class GiftCertificateOption {
	private int price;
	GiftCertificateOption(int price, String formattedPrice) {
		this.price = price;
		this.formattedPrice = formattedPrice;
	}
	public GiftCertificateOption(HashMap<String, Object> raw) {
		this.price = Integer.parseInt((raw.get("price").toString()));
		this.formattedPrice = (String) raw.get("formatted_price");
	}
	private String formattedPrice;
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @return the formattedPrice
	 */
	public String getFormattedPrice() {
		return formattedPrice;
	}
}
