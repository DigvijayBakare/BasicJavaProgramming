package TIllMay2024.Basics;

import java.util.Scanner;

public class print {
    public static void hollow(){
        // printing a hallow solid block of stars
//        Scanner sc = new Scanner(System.in);                                    // taking an input from user for number of rows and columns
        System.out.println("Enter the number of rows and columns: ");
//        int n=sc.nextInt(),m=sc.nextInt();
        int n=4, m=5;
        for(int i=1; i<=n;i++){                                                 // for loop for printing row stars
            for(int j=1;j<=m;j++){                                              // for loop for printing column stars
                if(i==1 || j==1 || i==n || j==m){                               // if conditional statement for printing stars for required condition only
                    System.out.print("* ");                                     // if condition is satisfied then print * and a space
                }else{
                    System.out.print("  ");                                     // if condition fails then print 2 spaces
                }
            }
            System.out.println();                                               // next line statement for going to next line
        }
//        sc.close();
    }

    public static void main(String[] args) {
        hollow();
    }
}
