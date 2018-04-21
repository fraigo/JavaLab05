package lab05;

public class InvalidBookDateException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidBookDateException(String message) {
		super(message);
	}

}
