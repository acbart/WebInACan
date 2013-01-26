package regular;

import java.util.List;
import java.util.Map;

import structured.StructuredBusinessDataListener;
import structured.StructuredBusinessSearch;
import structured.StructuredBusinessSearchListener;

import searcher.AbstractBusinessSearch;
import searcher.BusinessCategory;
import searcher.BusinessQuery;
import searcher.ClientStore;
import searcher.NamedLocation;


public class BusinessSearch implements AbstractBusinessSearch {

	public BusinessSearch(String consumerKey, String consumerSecret, String token, String tokenSecret) {
		this.structuredBusinessSearch = new StructuredBusinessSearch(consumerKey, consumerSecret, token, tokenSecret);
	}

	public BusinessSearch(boolean spoofing) {
		this.structuredBusinessSearch = new StructuredBusinessSearch(spoofing);
	}

	public BusinessSearch() {
		this.structuredBusinessSearch = new StructuredBusinessSearch();
	}
	
	public ClientStore getClientStore() {
		return this.structuredBusinessSearch.getClientStore();
	}

	private StructuredBusinessSearch structuredBusinessSearch;

	public void getBusinessData(String businessId, final BusinessDataListener listener) {
		this.structuredBusinessSearch.getBusinessData(businessId, new StructuredBusinessDataListener() {

			@Override
			public void onSuccess(Map<String, Object> business) {
				listener.onSuccess(new Business(business));
			}
			
			@Override
			public void onFailure(Exception exception) {
				listener.onFailure(exception);
			}


		});
	}

	public void searchBusinesses(BusinessQuery query, final BusinessSearchListener listener) {
		this.structuredBusinessSearch.searchBusinesses(query, new StructuredBusinessSearchListener() {

			@Override
			public void onSuccess(Map<String, Object> response) {
				listener.onSuccess(new SearchResponse(response));
			}
			
			@Override
			public void onFailure(Exception exception) {
				listener.onFailure(exception);
			}


		});
	}

	@Override
	public void connect(String consumerKey, String consumerSecret,
			String token, String tokenSecret) {
		this.structuredBusinessSearch.connect(consumerKey, consumerSecret, token, tokenSecret);
	}

	@Override
	public void setSpoofing(boolean spoofing) {
		this.structuredBusinessSearch.setSpoofing(spoofing);
	}

	@Override
	public List<BusinessCategory> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		final BusinessSearch bs = new BusinessSearch(true);
		bs.getBusinessData("bad input", new BusinessDataListener() {

			@Override
			public void onSuccess(Business business) {
				System.out.println(business);
			}
			
		});
		/*final BusinessSearch bs = new BusinessSearch("em86viPSqwmfF2PFfNsPEQ",
				"K7Dq24NKDMNNk-sz_-JMlAvDmSU",
				"hbML2QjyBfh-fvw5PsiF71pVLt2m3AbZ",
				"ggqII8lp1foy0ttolsYrTIUAm7c");
		bs.getBusinessData("ritas-water-ice-blacksburg", new BusinessDataListener() {

			@Override
			public void onSuccess(Business business) {
				BusinessQuery bq = new BusinessQuery(business.getLocation());
				bs.searchBusinesses(bq, new BusinessSearchListener() {

					@Override
					public void onSuccess(SearchResponse searchResponse) {
						System.out.println("SECOND: "+searchResponse);
					}
					
				});
			}
			
			@Override
			public void onFailure(Exception exception) {
				System.out.println("Exception:"+exception);
			}

		});
		
		BusinessQuery bq = new BusinessQuery(new NamedLocation("Blacksburg, VA"));
		bs.searchBusinesses(bq, new BusinessSearchListener() {

			@Override
			public void onSuccess(SearchResponse searchResponse) {
				System.out.println("FIRST: "+searchResponse);
				BusinessQuery bq = new BusinessQuery(searchResponse.getSuggestedDisplayRegion().getCenter());
				bs.searchBusinesses(bq, new BusinessSearchListener() {

					@Override
					public void onSuccess(SearchResponse searchResponse) {
						System.out.println("Third: "+searchResponse);
					}
					
				});
			}
			
		});*/
	}

}
