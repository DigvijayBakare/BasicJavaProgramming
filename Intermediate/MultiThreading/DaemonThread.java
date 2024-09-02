package MultiThreading;

public class DaemonThread {
    /*static {
        Thread.currentThread().setDaemon(true);         // we can never change the daemon nature of main thread
    }*/
    public static void main(String[] args) {
        System.out.println("is main thread daemon: "+Thread.currentThread().isDaemon());        // false
//        Thread.currentThread().setDaemon(true);         // RE: IllegalThreadStateException

        ThreadA a = new ThreadA();
        System.out.println("is child thread daemon: "+a.isDaemon());        // false
        a.setDaemon(true);
        System.out.println("is child thread daemon: "+a.isDaemon());        // true
    }
}

class ThreadA extends Thread{

}