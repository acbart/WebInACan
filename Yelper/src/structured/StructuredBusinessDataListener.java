package structured;

import java.util.Map;

import searcher.ErrorListener;

public abstract class StructuredBusinessDataListener extends ErrorListener {
	public abstract void onSuccess(Map<String, Object> business);
}
