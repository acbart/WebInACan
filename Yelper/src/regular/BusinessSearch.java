package regular;

import java.util.Map;

import exceptions.BusinessSearchException;

import main.AbstractBusinessSearch;
import main.BusinessQuery;

import structured.StructuredBusinessDataListener;
import structured.StructuredBusinessSearch;
import structured.StructuredBusinessSearchListener;

/**
 * The StructuredBusinessSearch class is used to connect to the Yelp service and
 * retrieve data as well-structured classes. All data is returned asynchronously
 * - your program will continue to run while the data is being fetched, and the
 * result will be sent to a callback function that you specify.<br>
 * <br>
 * 
 * There will only be one instance of the StructuredBusinessSearch, because it
 * follows the Singleton pattern. In order to use it, first get the instance of
 * the class.
 * 
 * <pre>
 * StructuredBusinessSearch sbs = StructuredBusinessSearch.getInstance();
 * </pre>
 * 
 * Then you can either connect to the online service:
 * 
 * <pre>
 * sbs.connect(&quot;key&quot;, &quot;secret&quot;, &quot;token&quot;, &quot;secrettoken&quot;);
 * </pre>
 * 
 * or use the service offline:
 * 
 * <pre>
 * sbs.setLocal();
 * </pre>
 * 
 * @author acbart
 * 
 */
public class BusinessSearch implements AbstractBusinessSearch {

	private static BusinessSearch instance;

	/**
	 * Retrieves the singleton instance of the JsonBusinessSearch.
	 * 
	 * @return
	 */
	public static BusinessSearch getInstance() {
		if (instance == null) {
			synchronized (BusinessSearch.class) {
				if (instance == null) {
					instance = new BusinessSearch();
				}
			}
		}
		return instance;
	}

	/**
	 * Protected Constructor guards against instantiation.
	 */
	protected BusinessSearch() {
		structuredBusinessSearch = StructuredBusinessSearch.getInstance();
	}

	private StructuredBusinessSearch structuredBusinessSearch;

	/**
	 * Returns data about a business given its businessId (which is a sequence
	 * of characters, symbols, and numbers, e.g. "I_7cQmHxx6LokP9yr7Fx-w").
	 * 
	 * @param businessId
	 *            A string identifying the business.
	 * @param listener
	 *            a callback function that will consume the data (or error)
	 *            about the business.
	 */
	public void getBusinessData(String businessId,
			final BusinessDataListener listener) {
		this.structuredBusinessSearch.getBusinessData(businessId,
				new StructuredBusinessDataListener() {

					@Override
					public void onSuccess(Map<String, Object> business) {
						listener.onSuccess(new Business(business));
					}

					@Override
					public void onFailure(BusinessSearchException exception) {
						listener.onFailure(exception);
					}

				});
	}

	/**
	 * Queries the Yelp service for businesses that match the given
	 * BusinessQuery. Returns the data (or error) through the listener object.
	 * 
	 * @param query
	 *            A BusinessQuery object
	 * @param listener
	 *            A listener object that should contain methods for handling the
	 *            data and, optionally, any errors.
	 */
	public void searchBusinesses(BusinessQuery query,
			final BusinessSearchListener listener) {
		this.structuredBusinessSearch.searchBusinesses(query,
				new StructuredBusinessSearchListener() {

					@Override
					public void onSuccess(Map<String, Object> response) {
						listener.onSuccess(new SearchResponse(response));
					}

					@Override
					public void onFailure(BusinessSearchException exception) {
						listener.onFailure(exception);
					}

				});
	}

	/**
	 * Establishes a connection to the online Business Search service.
	 * dataservice. This requires an internet connection.
	 * 
	 * Requires registration information from Yelp. To get your key go to
	 * http://www.yelp.com/developers
	 * 
	 * @param consumerKey
	 * @param consumerSecret
	 * @param token
	 * @param tokenSecret
	 */
	public void connect(String consumerKey, String consumerSecret,
			String token, String tokenSecret) {
		this.structuredBusinessSearch.connect(consumerKey, consumerSecret,
				token, tokenSecret);
	}

	/**
	 * Establishes that Business Search data should be retrieved locally. This
	 * does not require an internet connection.
	 * 
	 * If data is being retrieved locally, you must be sure that your parameters
	 * match locally stored data. Otherwise, you will get nothing in return.
	 * 
	 * @param local
	 */
	public void setLocal() {
		this.structuredBusinessSearch.setLocal();
	}

	public static void main(String[] args) {
		final BusinessSearch bs = BusinessSearch.getInstance();
		bs.setLocal();
		bs.getBusinessData("bad input", new BusinessDataListener() {

			@Override
			public void onSuccess(Business business) {
				System.out.println(business);
			}

		});
	}

}
