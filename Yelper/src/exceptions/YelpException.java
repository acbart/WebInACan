package exceptions;

public class YelpException extends Exception{
	private String id;
	private String message;
	private String fields;
	
	public YelpException(String id, String message, String fields) {
		super(message);
		this.id = id;
		this.message = message;
		this.fields = fields;
	}
	
	public String toString() {
		return "ERROR "+this.id + ": " + this.message+"\n"+this.fields;
	}

	public String getId() {
		return id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getFields() {
		return fields;
	}
}
