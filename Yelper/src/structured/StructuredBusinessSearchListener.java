package structured;

import java.util.Map;

import main.ExceptionListener;

/**
 * A listener for handling data received about a list of businesses. On success,
 * a Map containing all the information about the List of Businesses will be
 * passed to the onSuccess method, which must be overridden in any implementing
 * classes. On failure, the default behavior is to print any exceptions to the
 * standard error, although the onFailure method can also be overridden.<br>
 * <br>
 * 
 * Details about the fields of the Map returned can be found in the Yelp API
 * documentation: http://www.yelp.com/developers/documentation/v2/search_api
 * 
 * @author acbart
 * 
 */
public abstract class StructuredBusinessSearchListener extends
		ExceptionListener {
	/**
	 * The method that should be overridden to handle the Map of the list of
	 * businesses. For reference on the data being returned, consult the Yelp
	 * API documentation:
	 * http://www.yelp.com/developers/documentation/v2/search_api
	 * 
	 * @param businessData
	 */
	public abstract void onSuccess(Map<String, Object> searchResponse);
}
