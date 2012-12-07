package structured;

import java.util.Map;

import searcher.ErrorListener;

public abstract class StructuredBusinessSearchListener extends ErrorListener {
	public abstract void onSuccess(Map<String, Object> searchResponse);
}
