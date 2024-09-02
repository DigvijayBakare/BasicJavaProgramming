package TIllMay2024.Digvijay;
// Convert the temperature from Degree Fahrenheit to Degree Celsius..
import java.util.Scanner;

public class FahrenheitoCelsius {
    public static void main(String[] args) {
        double c,f;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit = ");
        f = S.nextDouble();
        c = (5.0/9.0)*(f-32);
        System.out.println("Temperature in Degree Celsius = "+c);
    }
}
