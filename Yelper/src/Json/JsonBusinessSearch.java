package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import regular.JsonConverter;
import searcher.AbstractBusinessSearch;
import searcher.BusinessAPI;
import searcher.BusinessCategory;
import searcher.BusinessQuery;

import org.json.simple.parser.ParseException;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import exceptions.YelpException;


public class JsonBusinessSearch implements AbstractBusinessSearch {

	protected boolean connected;
	protected boolean spoof;
	protected OAuthService service;
	protected Token accessToken;
	protected List<BusinessCategory> rootCategory;

	/**
	 * Creates a new Business Search that cannot connect to the internet.
	 * Instead, all calls will be made to the local data set.
	 */
	public JsonBusinessSearch() {
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
	public JsonBusinessSearch(boolean spoofing) {
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
	public JsonBusinessSearch(String consumerKey, String consumerSecret, String token, String tokenSecret) {
		this();
		this.connect(consumerKey, consumerSecret, token, tokenSecret);
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
		this.service = new ServiceBuilder().provider(BusinessAPI.class).apiKey(consumerKey).apiSecret(consumerSecret).build();
		this.accessToken = new Token(token, tokenSecret);
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
	
	public String makeRequest(String destination, HashMap<String, String> hashMap) {
		 OAuthRequest request = new OAuthRequest(Verb.GET, "http://api.yelp.com/v2/" +destination);
		 for (Entry<String, String> parameter: hashMap.entrySet()) {
			 String key = parameter.getKey();
			 String value = parameter.getValue();
			 request.addQuerystringParameter(key, value);
		 }
		 this.service.signRequest(this.accessToken, request);
		 System.out.println(request.getQueryStringParams());
		 Response response = request.send();
		 return response.getBody();
	}
	

	public void getBusinessData(String businessId,
								  JsonBusinessDataListener listener) {
		String response = this.makeRequest("business/"+businessId, new HashMap<String, String>());
		Exception error = this.checkErrors(response);
		if (error == null) {
			listener.onSuccess(response);
		} else {
			listener.onFailure(error);
		}
	}
	
	

	private Exception checkErrors(String response) {
		try {
			HashMap<String, Object> r = JsonConverter.convertToHashMap(response);
			if (r.containsKey("error")) {
				@SuppressWarnings("unchecked")
				HashMap<String, Object> error = (HashMap<String, Object>) r.get("error");
				return new YelpException((String)error.get("id"), 
						(String)error.get("text"),
						(String)error.get("field"));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e;
		}
		return null;
	}

	public void searchBusinesses(BusinessQuery query,
								   JsonBusinessSearchListener listener) {
		// TODO Auto-generated method stub
		System.out.println(query.getFilters());
		String response = this.makeRequest("search", query.getFilters());
		Exception error = this.checkErrors(response);
		if (error == null) {
			listener.onSuccess(response);
		} else {
			listener.onFailure(error);
		}
	}
	
	public static void main(String[] args) {
		JsonBusinessSearch jbs = new JsonBusinessSearch("em86viPSqwmfF2PFfNsPEQ",
														"K7Dq24NKDMNNk-sz_-JMlAvDmSU",
														"hbML2QjyBfh-fvw5PsiF71pVLt2m3AbZ",
														"ggqII8lp1foy0ttolsYrTIUAm7c");
		jbs.getBusinessData("Te72-fjbquQFCfPBgJ4ldQ", new JsonBusinessDataListener() {

			@Override
			public void onSuccess(String business) {
				System.out.println("SUCCESS"+business);
			}
			
		});
		
		BusinessQuery bq = new BusinessQuery("blacksburg va");
		jbs.searchBusinesses(bq, new JsonBusinessSearchListener() {

			@Override
			public void onSuccess(String searchResponse) {
				System.out.println("AWESOME"+searchResponse);
			}
			
		});
	}
}
