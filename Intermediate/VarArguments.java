package June2024.DurgaLearning;

import java.util.Arrays;

public class VarArguments {
    static void m(int... x){
        System.out.println(Arrays.toString(x));
        int sum = 0, count = 0;
        for (int i : x){
            sum += i;
            count++;
        }
        System.out.println("Sum of "+count+" numbers is "+sum);
    }
    public static void main(String[] args){
        m(10,20,30,40,50);
    }
}
