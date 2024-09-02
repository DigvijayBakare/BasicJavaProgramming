package MultiThreading.Enhancements;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class MyThreadTime extends Thread {
    static ReentrantLock l = new ReentrantLock();
    MyThreadTime(String name) {
        super(name);
    }
    @Override
    public void run() {
        do {
            try {
                if (l.tryLock(3000, TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+" ... got the lock");
                    Thread.sleep(30000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName()+" ... release the lock");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName()+" ...unable to get lock and will try again");
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}

public class TryLockWithTime {
    public static void main(String[] args) {
        MyThreadTime t1 = new MyThreadTime( "First thread");
        MyThreadTime t2 = new MyThreadTime("Second thread");
        t1.start();
        t2.start();
    }
}