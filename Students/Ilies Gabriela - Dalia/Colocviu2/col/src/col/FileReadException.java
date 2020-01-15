package col;

public class FileReadException extends Exception{
	public FileReadException() {
		super("exceptie la citirea din fisier");
	}
	public FileReadException(String message) {
		super(message);
	}

}
