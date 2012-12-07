package json;


import searcher.ErrorListener;

public abstract class JsonBusinessDataListener extends ErrorListener {
	public abstract void onSuccess(String business);
}
