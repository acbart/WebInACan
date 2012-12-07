package regular;

import searcher.ErrorListener;

public abstract class BusinessSearchListener extends ErrorListener {
	public abstract void onSuccess(SearchResponse searchResponse);
}
