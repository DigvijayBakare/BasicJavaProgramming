package MultiThreading.Synchronization;

class  Display1{
    public synchronized void displayNo() {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {}
        }
    }
    public synchronized void displayChar() {
        for (int i=65; i<=75; i++) {
            System.out.println((char)i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {}
        }
    }
}
class MyThreadClass1 extends Thread {
    Display1 d;
    MyThreadClass1(Display1 d) {
        this.d = d;
    }
    @Override
    public void run() {
        d.displayNo();
    }
}
class MyThreadClass2 extends Thread {
    Display1 d;
    MyThreadClass2(Display1 d) {
        this.d = d;
    }
    @Override
    public void run() {
        d.displayChar();
    }
}
public class NewSynchronization {
    public static void main(String[] args) {
        Display1 d = new Display1();
        MyThreadClass1 t1 = new MyThreadClass1(d);
        MyThreadClass2 t2 = new MyThreadClass2(d);
        t1.start();
        t2.start();
    }
}