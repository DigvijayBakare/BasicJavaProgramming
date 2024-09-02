package June2024.ExceptionHandling.CustomisedException;

public class TooYoungException extends RuntimeException {
    TooYoungException (String s) {
        super(s);
        //Why super(s): To make description available to default exception handler
    }
}
