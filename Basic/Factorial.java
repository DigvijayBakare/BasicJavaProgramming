package TIllMay2024.Digvijay;
// Find the Factorial of given number using for loop..
import java.util.Scanner;

class fact{
    double   fact123(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number who's factorial is needed.");
        int n = Sc.nextInt();
        if (n<0){
            System.out.println("Invalid Input");
        }
        int i,fact=1;
        for (i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of numbers = "+fact);
        return fact;
    }
}
public class Factorial extends fact {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.fact123();
    }
}
