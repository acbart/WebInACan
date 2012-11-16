package SemiStructured;

import java.util.Map;

public interface SemiStructuredBusinessCallback {
	public void onSuccess(Map<String, Object> data);
	public void onError(Exception exception);
}
