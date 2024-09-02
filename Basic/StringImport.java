package TIllMay2024.String;
import java.util.Scanner;

// How to import a string

public class StringImport {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);                    // Scanner class is used to take an input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();                             // nextLine() is a method to take whole line as an input
        System.out.println("Entered string: "+str);

        System.out.print("Enter next string: ");
        String str0 = sc.next();                                // next() is a method to take first word of a line as an input
        System.out.println("Entered string: "+str0);

    }
}
