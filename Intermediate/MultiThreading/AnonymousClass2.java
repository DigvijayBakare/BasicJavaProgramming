package MultiThreading;

class Demo1 {
    void display() {
        System.out.println("Display in demo1");
    }
}
class Demo2 {
    void dummy() {
        System.out.println("Inside dummy method");
        Demo1 d = new Demo1() {
            @Override
            void display() {
                System.out.println("Display in anonymous class");
            }
        };
    }
}
public class AnonymousClass2 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.dummy();
    }
}
