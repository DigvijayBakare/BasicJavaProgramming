package June2024.ExceptionHandling.CustomisedException;

import java.util.Scanner;

public class MarriageAgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age>60){
            throw new TooOldException("Your age has already passed marriage age limit..");
        } else if (age<18) {
            throw new TooYoungException("Please wait some more time, you'll get best match soon");
        }else System.out.println("You will get match details soon by email....");

        System.out.println("Hello");
    }
}
