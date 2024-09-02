package TIllMay2024.Digvijay;

import java.util.Scanner;

public class Butterfly {
    public static void hollowPyramid(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the hollow pyramid: ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            for (int j = numRows-i; j > 1; j--) {
                System.out.print(" "); // Print spaces for alignment
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i || i == numRows - 1) {
                    System.out.print("* "); // Print stars at the edges and base
                } else {
                    System.out.print("  "); // Print spaces for the hollow part
                }
            }
            System.out.println(); // Move to the next line
        }
//        scanner.close();
    }
    public static void hollowButterfly() {
        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
        int n=5;
        // Upper half
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (j==1 || j==i || j==n-j) {
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                if (j==1 || j==i || j==n-j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Lower half
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                if (j==1 || j==i || j==n-j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                if (j==1 || j==i || j==n-j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void palindromic(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pascalTriangle(){
        int numRows=5;
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" "); // Print spaces for alignment
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println(); // Move to the next line
        }
    }
    public static void main(String[] args) {
//        hollowButterfly();
//        hollowPyramid();
//        palindromic();
        pascalTriangle();
    }
}

/* asdfnmjhgrewq*/