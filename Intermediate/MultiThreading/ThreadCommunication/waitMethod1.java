package MultiThreading.ThreadCommunication;

public class waitMethod1 {
    public static void main(String[] args) throws InterruptedException{
        ThreadA a = new ThreadA();
        a.start();
        Thread.sleep(10000);
        synchronized (a) {
            System.out.println("Main method is trying to call wait() method");
//            a.wait();
            a.wait(10000);
        }
        System.out.println("Main thread got the notification");
        System.out.println("Result: "+a.total);
    }
}

class ThreadA extends Thread {
    int total = 0;
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Child thread starts calculation");
            for (int i=0; i<=100; i++) {
                total += i;
            }
            System.out.println("Child thread giving notification");
            this.notify();
        }
    }
}