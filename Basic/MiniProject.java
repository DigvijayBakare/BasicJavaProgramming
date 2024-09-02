package TIllMay2024.Digvijay;

// Mini project to guess a number between 1-100 which is going to print randomly

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int myNumber =(int) (Math.random()*100);
        int userNumber = 0;
        do {
            System.out.println("Guess my number(1-100): ");
            userNumber = Sc.nextInt();
            if (userNumber == myNumber){
                System.out.println("Woohoo.... Correct number!!");
                break;
            } else if (userNumber>myNumber) {
                System.out.println("Your number is too large");
            }else System.out.println("Your number is too small");
        }while (userNumber >= 0);

        System.out.println("My number was: "+myNumber);
    }
}
