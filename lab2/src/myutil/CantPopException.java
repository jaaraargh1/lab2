
package myutil;

public class CantPopException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1079707838623503848L;

	public CantPopException() {
		super("Det FINNS inget att poppa.");
	}
}