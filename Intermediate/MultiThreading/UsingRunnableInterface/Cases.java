package MultiThreading.UsingRunnableInterface;

class MyThread12 implements Runnable{
    @Override
    public void run() {
        System.out.println("Child thread");
    }
}
public class Cases {
    public static void main(String[] args) {
        MyThread12 t = new MyThread12();
        Thread  t1 = new Thread();
        Thread  t2 = new Thread(t);

        // Case 1:
        t1.start();     // new thread and execute thread class run method

        // Case 2:
        t1.run();       // no new thread and execute thread class run method like normal method

        // Case 3:
        t2.start();       // new thread and execute MyThread12 class run method

        // Case 4:
        t2.run();       // no new thread and execute MyThread12 class run method like normal method

        // Case 5:
//        t.start();      // Cannot resolve method 'start' in 'MyThread12'

        // Case 6:
        t.run();       // no new thread and execute MyThread12 class run method like normal method
    }
}
