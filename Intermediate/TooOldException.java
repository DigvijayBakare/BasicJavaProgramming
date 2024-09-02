package June2024.ExceptionHandling.CustomisedException;

public class TooOldException extends RuntimeException {
    TooOldException(String s) {
        super(s);
    }
}
