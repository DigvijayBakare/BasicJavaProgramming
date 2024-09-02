package MultiThreading.Enhancements;

class MyThread extends Thread {
    MyThread (ThreadGroup g, String name) {
        super(g,name);
    }
    @Override
    public void run() {
        System.out.println("Child Thread");
        try {
             Thread.sleep(5000);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
public class ThreadGroupTest2 {
    public static void main(String[] args) throws Exception {
        ThreadGroup pg = new ThreadGroup("Parent ThreadGroup");
        ThreadGroup cg = new ThreadGroup(pg,"Child ThreadGroup");
        MyThread t1 = new MyThread(pg,"Child Thread 1");
        MyThread t2 = new MyThread(pg,"Child Thread 2");
        t1.start();
        t2.start();
        System.out.println("Active Threads: "+pg.activeCount());
        System.out.println("Active ThreadGroup: "+pg.activeGroupCount());
        pg.list();

        // after sleeping for 10sec
        Thread.sleep(10000);
        System.out.println("Active Threads: "+pg.activeCount());
        System.out.println("Active ThreadGroup: "+pg.activeGroupCount());
        pg.list();
    }
}
