
package myutil;
/*
 *  om stacken är tom kastar den ett exception
 * 
 */
public class StackIsEmptyException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6994238517992084302L;

	public StackIsEmptyException() {
		super("Stacken alt. kön är tom.");
	}
}