package structured;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;

import json.JsonBusinessDataListener;
import json.JsonBusinessSearch;
import json.JsonBusinessSearchListener;

import regular.JsonConverter;
import searcher.AbstractBusinessSearch;
import searcher.BusinessCategory;
import searcher.BusinessQuery;


public class StructuredBusinessSearch implements AbstractBusinessSearch {

	public StructuredBusinessSearch(String consumerKey, String consumerSecret, String token, String tokenSecret) {
		this.jsonBusinessSearch = new JsonBusinessSearch(consumerKey, consumerSecret, token, tokenSecret);
	}

	public StructuredBusinessSearch(boolean spoofing) {
		this.jsonBusinessSearch = new JsonBusinessSearch(spoofing);
	}

	public StructuredBusinessSearch() {
		this.jsonBusinessSearch = new JsonBusinessSearch();
	}
	
	

	private JsonBusinessSearch jsonBusinessSearch;

	public void getBusinessData(String businessId, final StructuredBusinessDataListener listener) {
		this.jsonBusinessSearch.getBusinessData(businessId, new JsonBusinessDataListener() {

			@Override
			public void onSuccess(String business) {
				//TODO
				HashMap<String, Object> structuredBusiness = null;
				try {
					structuredBusiness = JsonConverter.convertToHashMap(business);
				} catch (ParseException e) {
					listener.onFailure(e);
				}
				listener.onSuccess(structuredBusiness);
			}

			public void onFailure(Exception exception) {
				listener.onFailure(exception);
			}

		});
	}


	public void searchBusinesses(BusinessQuery query, final StructuredBusinessSearchListener listener) {
		this.jsonBusinessSearch.searchBusinesses(query, new JsonBusinessSearchListener() {

			@Override
			public void onSuccess(String response) {
				//TODO
				HashMap<String, Object> structuredResponse = null;
				try {
					structuredResponse = JsonConverter.convertToHashMap(response);
				} catch (ParseException e) {
					listener.onFailure(e);
				}
				listener.onSuccess(structuredResponse);
			}

			public void onFailure(Exception exception) {
				listener.onFailure(exception);
			}

		});
	}

	@Override
	public void connect(String consumerKey, String consumerSecret,
			String token, String tokenSecret) {
		this.jsonBusinessSearch.connect(consumerKey, consumerSecret, token, tokenSecret);
	}

	@Override
	public void setSpoofing(boolean spoofing) {
		this.jsonBusinessSearch.setSpoofing(spoofing);
	}

	@Override
	public List<BusinessCategory> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		StructuredBusinessSearch sbs = new StructuredBusinessSearch("em86viPSqwmfF2PFfNsPEQ",
				"K7Dq24NKDMNNk-sz_-JMlAvDmSU",
				"--M397dy_1UeEcRccHfjeX-X8UeJhOOS",
				"sUwtVWXX53MwNlvtyM33GTIcj5A");
		sbs.getBusinessData("Te72-fjbquQFCfPBgJ4ldQ", new StructuredBusinessDataListener() {

			@Override
			public void onSuccess(Map<String, Object> business) {
				System.out.println(business);
			}

		});
	}

}
