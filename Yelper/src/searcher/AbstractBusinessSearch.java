package searcher;

import java.util.ArrayList;
import java.util.List;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.builder.api.DefaultApi10a;
import org.scribe.builder.ServiceBuilder;
import org.scribe.oauth.OAuthService;

public interface AbstractBusinessSearch {

	/**
	 * Connects an existing Business Searcher to the real Yelp dataservice.
	 * @param consumerKey
	 * @param consumerSecret
	 * @param token
	 * @param tokenSecret
	 */
	public void connect(String consumerKey, String consumerSecret, String token, String tokenSecret);

	/**
	 * Turns on spoofing, so that when the service needs to retrieve data from the Yelp
	 * service, it instead just grabs random data from the local store.
	 * @param spoofing
	 */
	public void setSpoofing(boolean spoofing);

	/**
	 * Returns a list of all the Business categories (which may have subcategories)
	 * @return
	 */
	public List<BusinessCategory> getCategories();
	
}
