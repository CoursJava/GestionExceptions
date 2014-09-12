package GestionExceptions;

public class ExceptionBof extends Exception {
	public ExceptionBof(String message) {
		super("Bof ! " + message);
	}
}