package MultiThreading.ThreadCommunication;

class Sum extends Thread {
    int total = 0;
    @Override
    public void run() {
        /*for (int i=1; i<=n; i++) {
            total += i;
        }*/
        int n = 100;
        total = ((n*(n+1))/2);
        this.notify();
//        System.out.println("Sum of first 100 numbers is "+total);
    }
}
public class WaitMethod {
    public static void main(String[] args) throws InterruptedException{
        Sum s = new Sum();
        s.start();
//        Thread.sleep(1000);                       // This kind of practice is not recommended if we are expecting some kind of updation.
//        s.join();
        System.out.println(s.total);
    }
}

