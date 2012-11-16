package Classy;

import java.util.List;

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
	/**
	 * @return the businesses
	 */
	public List<Business> getBusinesses() {
		return businesses;
	}
	/**
	 * @param businesses the businesses to set
	 */
	public void setBusinesses(List<Business> businesses) {
		this.businesses = businesses;
	}
	/**
	 * @return the suggestedDisplayRegion
	 */
	public RectangularLocation getSuggestedDisplayRegion() {
		return suggestedDisplayRegion;
	}
	/**
	 * @param suggestedDisplayRegion the suggestedDisplayRegion to set
	 */
	public void setSuggestedDisplayRegion(RectangularLocation suggestedDisplayRegion) {
		this.suggestedDisplayRegion = suggestedDisplayRegion;
	}
	/**
	 * @return the totalFound
	 */
	public int getTotalFound() {
		return totalFound;
	}
	/**
	 * @param totalFound the totalFound to set
	 */
	public void setTotalFound(int totalFound) {
		this.totalFound = totalFound;
	}
}
