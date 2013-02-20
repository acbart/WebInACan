package json;

import main.ExceptionListener;

/**
 * A listener for handling data received about a specific Business. On success,
 * a string of JSON containing all the information about the Business will be
 * passed to the onSuccess method, which must be overridden in any implementing
 * classes. On failure, the default behavior is to print any exceptions to the
 * standard error, although the onFailure method can also be overridden.<br>
 * <br>
 * 
 * Details about the JSON string returned can be found in the Yelp API
 * documentation: http://www.yelp.com/developers/documentation/v2/business
 * 
 * @author acbart
 * 
 */
public abstract class JsonBusinessDataListener extends ExceptionListener {
	/**
	 * The method that should be overridden to handle the JSON-formatted business
	 * data. For reference on the data being returned, consult the Yelp API
	 * documentation: http://www.yelp.com/developers/documentation/v2/business
	 * 
	 * @param businessData
	 */
	public abstract void onSuccess(String businessData);
}
