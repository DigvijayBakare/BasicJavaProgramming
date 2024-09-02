package June2024.ExceptionHandling.CustomisedException;

public class InterruptedExceptionHandled  {
    void run(){
        System.out.println("Interrupted StackException Handled");
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        InterruptedExceptionHandled a = new InterruptedExceptionHandled();
        a.run();

    }
}
