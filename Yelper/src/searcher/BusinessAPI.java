package searcher;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

public class BusinessAPI extends DefaultApi10a {
	/**
	 * Service provider for "2-legged" OAuth10a for Yelp API (version 2).
	 */

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