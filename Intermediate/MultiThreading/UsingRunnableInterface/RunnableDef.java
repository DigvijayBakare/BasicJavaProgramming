package MultiThreading.UsingRunnableInterface;

public class RunnableDef implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        RunnableDef r = new RunnableDef();
        Thread t = new Thread(r);
        // here r is called as target runnable
        t.start();
        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}

// here we'll get mixed output and we cannot tell the exact ans