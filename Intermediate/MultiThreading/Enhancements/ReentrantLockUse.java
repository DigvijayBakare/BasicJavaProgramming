package MultiThreading.Enhancements;

import java.util.concurrent.locks.*;

// using reentrantLock we get correct output without using synchronized keyword

class DisplayMethod {
    ReentrantLock l = new ReentrantLock();
    public void wish(String name) {
        l.lock();                   // ---> 1
        for (int i = 0; i < 5; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(name);
        }
        l.unlock();                   // ---> 2
    }
}
// if we comment line 1 and 2, then the threads will be executed simultaneously, and we'll get irregular output
// if we are not commenting line 1 and 2, then the threads will be executed one by one and we'll get regular output

class MyThreadT extends Thread {
    DisplayMethod d;
    String name;

    MyThreadT(DisplayMethod d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class ReentrantLockUse {
    public static void main(String[] args) {
        DisplayMethod d = new DisplayMethod();
        MyThreadT t1 = new MyThreadT(d,"Dhoni");
        MyThreadT t2 = new MyThreadT(d,"YuvRaj");
        t1.start();
        t2.start();
    }
}
