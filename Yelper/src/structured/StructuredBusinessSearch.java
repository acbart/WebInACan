package structured;

import java.util.HashMap;
import java.util.Map;

import main.AbstractBusinessSearch;
import main.BusinessQuery;

import org.json.simple.parser.ParseException;

import exceptions.DataUnreadableException;
import exceptions.BusinessSearchException;

import json.JsonBusinessDataListener;
import json.JsonBusinessSearch;
import json.JsonBusinessSearchListener;

import util.JsonConverter;

/**
 * The StructuredBusinessSearch class is used to connect to the Yelp service and
 * retrieve data as a Map. All data is returned asynchronously - your program
 * will continue to run while the data is being fetched, and the result will be
 * sent to a callback function that you specify.<br>
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
public class StructuredBusinessSearch implements AbstractBusinessSearch {
	private static StructuredBusinessSearch instance;

	/**
	 * Retrieves the singleton instance of the JsonBusinessSearch.
	 * 
	 * @return
	 */
	public static StructuredBusinessSearch getInstance() {
		if (instance == null) {
			synchronized (StructuredBusinessSearch.class) {
				if (instance == null) {
					instance = new StructuredBusinessSearch();
				}
			}
		}
		return instance;
	}

	/**
	 * Protected constructor to guard against instantiation.
	 */
	protected StructuredBusinessSearch() {
		jsonBusinessSearch = JsonBusinessSearch.getInstance();
	}

	private JsonBusinessSearch jsonBusinessSearch;

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
			final StructuredBusinessDataListener listener) {
		this.jsonBusinessSearch.getBusinessData(businessId,
				new JsonBusinessDataListener() {

					@Override
					public void onSuccess(String business) {
						HashMap<String, Object> structuredBusiness = null;
						try {
							structuredBusiness = (HashMap<String, Object>) JsonConverter
									.convertToMap(business);
						} catch (ParseException e) {
							listener.onFailure(new DataUnreadableException(
									"INVALID_DATA",
									"The JSON data received from the server couldn't be parsed.",
									e.toString()));
						}
						listener.onSuccess(structuredBusiness);
					}

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
			final StructuredBusinessSearchListener listener) {
		this.jsonBusinessSearch.searchBusinesses(query,
				new JsonBusinessSearchListener() {

					@Override
					public void onSuccess(String response) {
						HashMap<String, Object> structuredResponse = null;
						try {
							structuredResponse = (HashMap<String, Object>) JsonConverter
									.convertToMap(response);
						} catch (ParseException e) {
							listener.onFailure(new DataUnreadableException(
									"INVALID_DATA",
									"The JSON data received from the server couldn't be parsed.",
									e.toString()));
						}
						listener.onSuccess(structuredResponse);
					}

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
		this.jsonBusinessSearch.connect(consumerKey, consumerSecret, token,
				tokenSecret);
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
		this.jsonBusinessSearch.setLocal();
	}

	public static void main(String[] args) {
		StructuredBusinessSearch sbs = StructuredBusinessSearch.getInstance();
		sbs.connect("em86viPSqwmfF2PFfNsPEQ", "K7Dq24NKDMNNk-sz_-JMlAvDmSU",
				"--M397dy_1UeEcRccHfjeX-X8UeJhOOS",
				"sUwtVWXX53MwNlvtyM33GTIcj5A");
		sbs.getBusinessData("Te72-fjbquQFCfPBgJ4ldQ",
				new StructuredBusinessDataListener() {

					@Override
					public void onSuccess(Map<String, Object> business) {
						System.out.println(business);
					}

				});
	}

}
