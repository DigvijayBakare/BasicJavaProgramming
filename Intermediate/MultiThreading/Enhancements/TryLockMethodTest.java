package MultiThreading.Enhancements;

import java.util.concurrent.locks.*;

// using reentrantLock we get correct output without using synchronized keyword

class MyThreadTry extends Thread {
    static ReentrantLock l = new ReentrantLock();

    MyThreadTry(String name) {
        super(name);
    }
    @Override
    public void run() {
        if (l.tryLock()){
            System.out.println(Thread.currentThread().getName()+" ... got the lock and performing safe operation");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException i) {
                System.out.println(i.getMessage());
            }
            l.unlock();
        } else {
            System.out.println(Thread.currentThread().getName()+" ...unable to get lock and hence performing alternative operation");
        }
    }
}

public class TryLockMethodTest {
    public static void main(String[] args) {

        MyThreadTry t1 = new MyThreadTry( "First thread");
        MyThreadTry t2 = new MyThreadTry("Second thread");
        t1.start();
        t2.start();
    }
}
