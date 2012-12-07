package json;

import searcher.ErrorListener;

public abstract class JsonBusinessSearchListener extends ErrorListener {
	public abstract void onSuccess(String searchResponse);
}
