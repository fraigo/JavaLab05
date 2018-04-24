package lab05;

/**
 * Invalid Argument Exception
 * @author Francisco Igor
 *
 */
public class InvalidArgumentException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param message Message for the exception
	 */
	public InvalidArgumentException(String message) {
		super(message);
	}

}
