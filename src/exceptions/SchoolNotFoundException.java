package exceptions;

public class SchoolNotFoundException extends Throwable {
    public SchoolNotFoundException() {
        super();
    }

    public SchoolNotFoundException(String message) {
        super(message);
    }

    public SchoolNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchoolNotFoundException(Throwable cause) {
        super(cause);
    }
}
