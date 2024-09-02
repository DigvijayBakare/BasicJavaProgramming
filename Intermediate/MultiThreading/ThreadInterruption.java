package MultiThreading;

class NewThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100000; i++) {
            System.out.println("I am lazy thread " + i);
        }
        System.out.println("I want to sleep");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }
}

/*class NewThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0; i<5; i++) {
                System.out.println("I am lazy thread "+i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }
}*/
public class ThreadInterruption {
    public static void main(String[] args) {
        NewThread t = new NewThread();
        t.start();
        t.interrupt();
        // thread interrupted using interrupt() method of thread class
        System.out.println("End of main");
    }
}
