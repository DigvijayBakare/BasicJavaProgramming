package June2024.DurgaLearning.AutoboxingAndUnboxing;

public class AutoboxingAndUnboxing {
    static Integer I = 10;
    public static void main(String[] args){
        int i = I;
        System.out.println(i);
        m(i);
    }
    public static void m(Integer k) {
        int m = k;
        System.out.println(m);
    }
}
