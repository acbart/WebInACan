package searcher;

import java.util.ArrayList;
import java.util.List;

import org.scribe.model.Token;
import org.scribe.builder.api.DefaultApi10a;
import org.scribe.builder.ServiceBuilder;
import org.scribe.oauth.OAuthService;

public abstract class AbstractBusinessSearch {

	/**
	 * Service provider for "2-legged" OAuth10a for Yelp API (version 2).
	 */
	public class YelpAPI extends DefaultApi10a {

	  @Override
	  public String getAccessTokenEndpoint() {
	    return null;
	  }

	  @Override
	  public String getAuthorizationUrl(Token arg0) {
	    return null;
	  }

	  @Override
	  public String getRequestTokenEndpoint() {
	    return null;
	  }

	}

	protected boolean connected;
	protected boolean spoof;
	protected OAuthService service;
	protected Token accessToken;
	protected List<BusinessCategory> rootCategory;

	/**
	 * Creates a new Business Search that cannot connect to the internet.
	 * Instead, all calls will be made to the local data set.
	 */
	public AbstractBusinessSearch() {
		this.connected = false;
		this.spoof = false;
		this.service = null;
		this.accessToken = null;
		this.rootCategory = new ArrayList<BusinessCategory>();
	}

	/**
	 * Creates a new Business Search that cannot connect to the internet.
	 * Instead, all calls will be made to the local data set.
	 * 
	 * @param spoofing Whether calls that would normally go to the internet should
	 * return random data from the local data set.
	 */
	public AbstractBusinessSearch(boolean spoofing) {
		this();
		this.spoof = spoofing;
	}

	/**
	 * Creates a new Business Search that can connect to the internet. Requires
	 * registration information from Yelp.
	 * @param consumerKey
	 * @param consumerSecret
	 * @param token
	 * @param tokenSecret
	 */
	public AbstractBusinessSearch(String consumerKey, String consumerSecret, String token, String tokenSecret) {
		this();
		this.connected = true;
		this.service = new ServiceBuilder().provider(YelpAPI.class).apiKey(consumerKey).apiSecret(consumerSecret).build();
		this.accessToken = new Token(token, tokenSecret);
	}

	/**
	 * Connects an existing Business Searcher to the real Yelp dataservice.
	 * @param consumerKey
	 * @param consumerSecret
	 * @param token
	 * @param tokenSecret
	 */
	public void connect(String consumerKey, String consumerSecret, String token, String tokenSecret) {
		this.connected= true;
	}

	/**
	 * Turns on spoofing, so that when the service needs to retrieve data from the Yelp
	 * service, it instead just grabs random data from the local store.
	 * @param spoofing
	 */
	public void setSpoofing(boolean spoofing) {
		this.spoof = spoofing;
	}

	/**
	 * Returns a list of all the Business categories (which may have subcategories)
	 * @return
	 */
	public List<BusinessCategory> getCategories() {return null;}
}
