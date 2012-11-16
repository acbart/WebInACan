package SemiStructured;

import java.util.Map;

public interface SemiStructuredSearchCallback {
	public void onSuccess(Map<String, Object> data);
	public void onError(Exception exception);
}
