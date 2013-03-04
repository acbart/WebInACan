package main;

import exceptions.BusinessSearchException;

/**
 * <b>This class is for internal use only!</b> If you wish to override the onFailure
 * behavior, do so in your instance of the appropriate Listener.<br><br>
 * 
 * A listener class with default behavior for handling exceptions. Unless
 * overridden, the onFailure method will print the exception to the standard
 * error stream. All the Listeners in the BusinessSearcher inherit from this
 * class in order to have this convenient default behavior.
 * 
 * @author acbart
 * 
 */
public class ExceptionListener {
	/**
	 * In the event of failure, print the exception to the standard error stream.
	 * 
	 * @param exception
	 */
	public void onFailure(BusinessSearchException exception) {
		System.err.println(exception);
	}
}
