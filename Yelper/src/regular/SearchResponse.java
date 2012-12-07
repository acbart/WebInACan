package regular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import searcher.BusinessCategory;
import searcher.RectangularLocation;


/**
 * A SearchResponse is returned by a search of businesses around a Location. It
 * has a list of businesses, a suggested region of a map to display those businesses,
 * and the total number of businesses found by the search (which will often be more
 * than the list of businesses in the SearchResponse, since usually only the first
 * 20 results are returned).
 * @author acbart
 *
 */
public class SearchResponse {
	private List<Business> businesses;
	private RectangularLocation suggestedDisplayRegion;
	private int totalFound;
	
	public SearchResponse(Map<String, Object> response) {
		
		this.totalFound = Integer.parseInt((response.get("total").toString()));
		HashMap<String, Object> region = (HashMap<String, Object>) response.get("region");
		this.suggestedDisplayRegion = (new RectangularLocation()).center(region);
		
		this.businesses = new ArrayList<Business>();
		Iterator<HashMap<String, Object>> i = ((ArrayList<HashMap<String, Object>>) response.get("businesses")).iterator();
		while (i.hasNext()) {
			this.businesses.add(new Business(i.next()));
		}
	}
	
	public String toString() {
		ArrayList<String> businessStrings = new ArrayList<String>();
		for (Business b : businesses) {
			businessStrings.add(b.toString());
		}
		return (new ToStringHelper("SearchResponse"))
				.add("totalFound", ""+totalFound)
				.add("businesses", "["+Util.join(businessStrings)+"]")
				.toString();
	}

	/**
	 * @return the businesses
	 */
	public List<Business> getBusinesses() {
		return businesses;
	}
	/**
	 * @return the suggestedDisplayRegion
	 */
	public RectangularLocation getSuggestedDisplayRegion() {
		return suggestedDisplayRegion;
	}
	/**
	 * @return the totalFound
	 */
	public int getTotalFound() {
		return totalFound;
	}
}
