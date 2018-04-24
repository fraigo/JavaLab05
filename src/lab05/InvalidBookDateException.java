package lab05;

/**
 * Invalid Date Exception
 * @author Francisco Igor
 */
public class InvalidBookDateException extends Exception {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * @param message Message for this exception
	 */
	public InvalidBookDateException(String message) {
		super(message);
	}

}
