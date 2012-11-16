
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

public abstract class Yelper {

	protected boolean connected;
	protected boolean spoof;
	protected OAuthService service;
	protected Token accessToken;
	protected List<BusinessCategory> rootCategory;

	public Yelper() {
		this.connected = false;
		this.spoof = false;
		this.service = null;
		this.accessToken = null;
		this.rootCategory = new ArrayList<BusinessCategory>();
	}

	public Yelper(boolean spoofing) {
		this();
		this.spoof = spoofing;
	}

	public Yelper(String consumerKey, String consumerSecret, String token, String tokenSecret) {
		this();
		this.connected = true;
		this.service = new ServiceBuilder().provider(YelpAPI.class).apiKey(consumerKey).apiSecret(consumerSecret).build();
		this.accessToken = new Token(token, tokenSecret);
	}

	public void connect(String consumerKey, String consumerSecret, String token, String tokenSecret) {
		this.connected= true;
	}

	public void setSpoofing(boolean spoofing) {
		this.spoof = spoofing;
	}

	public List<BusinessCategory> getCategories() {return null;}

	/**
	 * Given a Yelp Business ID, returns a JSON string of the data
	 * @param businessId
	 * @return
	 */
	public abstract Object getBusinessData(String businessId);

	public abstract Object searchBusinesses(Location location);
	public abstract Object searchBusinesses(Location location,
			int radius,
			List<String> terms, 
			List<BusinessCategory> categories, 
			boolean onlyDeals,
			SortMode sortMode,
			int resultsLimit,
			int resultsOffset);
	
	public abstract Object searchBusinesses(Location location,
			int radius);
	public abstract Object searchBusinesses(Location location, 
			List<String> terms, 
			List<BusinessCategory> categories, 
			boolean onlyDeals);
	public abstract Object searchBusinesses(Location location,
			SortMode sortMode);
	public abstract Object searchBusinesses(Location location,
			int resultsLimit,
			int resultsOffset);
	
	public abstract Object searchBusinesses(Location location,
			int radius,
			List<String> terms, 
			List<BusinessCategory> categories, 
			boolean onlyDeals);
	public abstract Object searchBusinesses(Location location, 
			List<String> terms, 
			List<BusinessCategory> categories, 
			boolean onlyDeals,
			SortMode sortMode);
	public abstract Object searchBusinesses(Location location, 
			List<String> terms, 
			List<BusinessCategory> categories, 
			boolean onlyDeals,
			int resultsLimit,
			int resultsOffset);
	public abstract Object searchBusinesses(Location location,
			SortMode sortMode,
			int resultsLimit,
			int resultsOffset);
	public abstract Object searchBusinesses(Location location,
			int radius,
			int resultsLimit,
			int resultsOffset);
	public abstract Object searchBusinesses(Location location,
			int radius,
			SortMode sortMode);
	
	public abstract Object searchBusinesses(Location location,
			int radius,
			List<String> terms, 
			List<BusinessCategory> categories, 
			boolean onlyDeals,
			SortMode sortMode);
	public abstract Object searchBusinesses(Location location,
			int radius,
			List<String> terms, 
			List<BusinessCategory> categories, 
			boolean onlyDeals,
			int resultsLimit,
			int resultsOffset);
	public abstract Object searchBusinesses(Location location,
			int radius,
			SortMode sortMode,
			int resultsLimit,
			int resultsOffset);
	public abstract Object searchBusinesses(Location location, 
			List<String> terms, 
			List<BusinessCategory> categories, 
			boolean onlyDeals,
			SortMode sortMode,
			int resultsLimit,
			int resultsOffset);

	/*
	 * DataNotAvailable exception
	 * NoConnection exception
	 */
}
