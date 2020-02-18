
package myutil;

public class OutOfReachException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3402063785852838283L;

	public OutOfReachException() {
		super("Finns inget att returnera,söknyckelen är längre än Index.");
	}
}