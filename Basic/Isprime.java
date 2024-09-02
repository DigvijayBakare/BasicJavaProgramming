package TIllMay2024.Digvijay;

public class Isprime {
    public static void main(String[] args) {
        int n = 67;
        boolean flag = false;
        for (int i = 2;i<n;i++){
            if (n%i==0){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
