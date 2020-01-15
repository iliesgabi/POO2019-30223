package col;

public class IncompletDataException extends Exception{
	public IncompletDataException() {
		super("date incomplete");
	}
	public IncompletDataException(String message) {
		super(message);
	}
}
