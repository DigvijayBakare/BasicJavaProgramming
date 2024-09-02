package TIllMay2024.Loops;

public class Pyramid1 {
    public static void PyramidPrint(int n){
        for (int i=0;i<n;i++){
            for (int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        PyramidPrint(n);
    }
}
