package MultiThreading.ThreadCommunication;

public class DeadLock extends Thread {
    A a = new A();
    B b = new B();
    public void m1() {
        this.start();
        a.d1(b);
    }
    @Override
    public void run() {
        b.d2(a);                // this line is executed by main thread
    }
    public static void main(String[] args) {
        DeadLock d = new DeadLock();
        d.m1();                // this line is executed by child thread
    }
}
class A {
    public synchronized void d1(B b) {
        System.out.println("Thread1 starts execution of d1() method");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println("Thread1 trying to call B's last() method");
        b.last();
    }
    public synchronized void last() {
        System.out.println("Inside A, last() method");
    }
}
class B {
    public synchronized void d2(A a) {
        System.out.println("Thread2 starts execution of d2() method");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println("Thread2 trying to call A's last() method");
        a.last();
    }
    public synchronized void last() {
        System.out.println("Inside B, last() method");
    }
}

// In the above program if we remove at least one synchronized keyword then the program won't enter into deadlock
// hence synchronized keyword is the only reason for deadlock situation, due to this while using synchronized
// keyword we have to take special care