package myutil;

public class OutOfReachException extends RuntimeException {
	public OutOfReachException() {
		super("Finns inget att returnera,söknyckelen är längre än Index.");
	}
}