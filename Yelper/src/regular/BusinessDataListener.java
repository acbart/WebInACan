package regular;


import searcher.ErrorListener;

public abstract class BusinessDataListener extends ErrorListener {
	public abstract void onSuccess(Business business);
}
