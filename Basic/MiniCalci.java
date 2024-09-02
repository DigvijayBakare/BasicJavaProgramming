package TIllMay2024.BlocksInJava;

public class MiniCalci {
    static int a=10, b=5, c=0;
    {
        System.out.println("Multiplication = "+(a*b));
        System.out.println("Division = "+(a/b));
    }
    static {
        System.out.println("Addition = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
    }

    public static void main(String[] args) {
        MiniCalci mc = new MiniCalci();             // We need an object of a class for non-static block execution
    }
}
