package MultiThreading;

class DemoClass {
    void display() {
        System.out.println("Inside DemoClass, display method");
    }
    void dummy() {
        System.out.println("Inside DemoClass, dummy method");
    }
}
public class AnonymousClass1 {
    public static void main(String[] args) {
        // creating an anonymous class in main method
        DemoClass d = new DemoClass() {
            // overriding method/s in DemoClass
//            void display() {
//                System.out.println("Inside Anonymous class, display method");
//            }
            void dummy() {
                System.out.println("Inside Anonymous class, dummy method");
            }
        };
        d.display();
        d.dummy();
    }
}
