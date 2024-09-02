package MultiThreading;

public class ThreadDaemon {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
//        b.setDaemon(true);
        // if we are commenting above line both main and child threads are non daemon and hence both threads will
        // execute until there completion if we are not commiting above line then main thread is non daemon and child
        // thread is daemon hence whenever main thread terminates automatically child thread will be terminated
        // ten child thread will be executed only once, or even it may not execute at all
        b.start();
        System.out.println("End of main thread");
//        b.stop();                   // 'stop()' is deprecated since version 1.2 and marked for removal
    }
}
class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}