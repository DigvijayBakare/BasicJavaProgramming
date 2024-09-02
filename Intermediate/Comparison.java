package June2024.DurgaLearning.AutoboxingAndUnboxing;

public class Comparison {
    public static void m1(Integer I) {
        System.out.println("Autoboxing");
    }

    public static void m1(Object o) {               // object version is valid for promoting
        System.out.println("Object version");
    }

    public static void m1(int... I) {
        System.out.println("vararg method");
    }

    public static void m1(Long I) {             // int -> long -> Long
        System.out.println("vararg method");
    }

    public static void m1(long l) {
        System.out.println("Widening");
    }

    public static void main(String[] args) {
        int x = 10;
        m1(x);
        // widening dominates both autoboxing and var arg method
        // for calling Long I method we'll need to cast integer to long during parameter passing
        // widening > autoboxing > varargs methods
    }
}
