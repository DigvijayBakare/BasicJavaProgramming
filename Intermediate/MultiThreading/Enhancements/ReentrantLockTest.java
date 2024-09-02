package MultiThreading.Enhancements;

import java.util.concurrent.locks.*;

public class ReentrantLockTest {
    public static void main(String[] args) {
        ReentrantLock l = new ReentrantLock();
        l.lock();
        l.lock();
        System.out.println("Is locked: "+l.isLocked());         // true
        System.out.println("Is held by current thread: "+l.isHeldByCurrentThread());        // true
        System.out.println("Get queued length: "+l.getQueueLength());           // 0
        l.unlock();
        System.out.println("Get hold count: "+l.getHoldCount());        // 1
        System.out.println("Is locked: "+l.isLocked());                 // true
        l.unlock();
        System.out.println("Is locked: "+l.isLocked());         // false

        System.out.println("Is fair: "+l.isFair()               // false
        );
    }
}
