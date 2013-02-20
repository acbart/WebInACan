package regular;

import main.ExceptionListener;

/**
 * A listener for handling data received about a specific Business. On success,
 * an instance of a Business will be passed to the onSuccess method, which must
 * be overridden in any implementing classes. On failure, the default behavior
 * is to print any exceptions to the standard error, although the onFailure
 * method can also be overridden.
 * 
 * @author acbart
 * 
 */
public abstract class BusinessDataListener extends ExceptionListener {
	/**
	 * The method that should be overridden to handle the Business instance.
	 * 
	 * @param businessData
	 */
	public abstract void onSuccess(Business business);
}
