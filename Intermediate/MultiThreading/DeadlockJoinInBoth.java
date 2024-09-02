package MultiThreading;

// deadlock will be happened here because both threads will wait for each other forever
// also if the thread calls join() method on itself then it will wait for infinite amount of time

class NewMyThread1 extends Thread{
    static Thread mt;
    @Override
    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for (int i=0; i<5; i++) {
            System.out.println("Child Thread");
        }
    }
}
public class DeadlockJoinInBoth {
    public static void main(String[] args) throws InterruptedException {
        NewMyThread1.mt = Thread.currentThread();
        NewMyThread1 t = new NewMyThread1();
        t.start();
        t.join();
        for (int i=0; i<5; i++){
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}
