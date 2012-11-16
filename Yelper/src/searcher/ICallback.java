package searcher;

public interface ICallback {
	public void onSuccess(Object data);
	public void onError(Exception exception);
}
