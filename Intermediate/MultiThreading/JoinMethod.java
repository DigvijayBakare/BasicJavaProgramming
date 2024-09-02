package MultiThreading;

class NewMyThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}
public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        NewMyThread t = new NewMyThread();
        t.start();
//        t.join();                               // main thread is waiting till the completion of child thread
//        t.join(5000);                     // main thread is waiting till the completion of time given to complete the child thread
        t.join(6000,100);          // main thread is waiting till the completion of time given to complete the child thread
        for (int i=0; i<5; i++){
            System.out.println("Main Thread");
        }
    }
}

