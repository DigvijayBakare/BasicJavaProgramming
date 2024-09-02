package MultiThreading.Synchronization;

class Y {

}
class Z {

}
class X {
    public synchronized void m1() {
        // here thread has lock of X object
        Y y = new Y();
        synchronized (y) {
            // here thread has lock of X and Y object
            Z z = new Z();
            for (int i=0; i<5; i++) {
                System.out.println(i);
            }
            synchronized (z) {
                // here thread has lock of X,Y and Z objects
                for (int i=0; i<5; i++) {
                    System.out.println("Hello Java");
                }
            }
        }
    }
}
public class NestedSynchronization {
    public static void main(String[] args) {
        X x = new X();
        x.m1();
    }
}
