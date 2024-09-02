package TIllMay2024.Digvijay;
// Converting the temperature from Degree Celsius to Degree Fahrenheit..
import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        double c,f;
        Scanner SW = new Scanner(System.in);
        System.out.println("Enter Temperature in degree celsius");
        c = SW.nextDouble();
        f = (1.8*c)+32;
        System.out.println("Temperature in degree Fahrenheit = "+f);
    }
}
