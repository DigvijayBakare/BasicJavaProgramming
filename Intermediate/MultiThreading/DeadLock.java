package MultiThreading;

public class DeadLock {
    final static String R1 = "Hello Welcome to Scaler!";
    final static String R2 = "Visit Scaler!";

    public static void main(String[] args) {
        // creating thread T1
        Thread T1 = new Thread() {
            // implementing run method
            public void run() {

                // thread T1 locking the R1 resource
                synchronized (R1) {
                    System.out.println("Thread T1 locked ->   Resource R1");
                    R1.notify();
                    // thread T1 locking the R2 resource
                    synchronized (R2) {
                        System.out.println("Thread T1 locked -> Resource R2");
                    }
                }
            }
        };

        // creating thread T2
        Thread T2 = new Thread() {
            // implementing run method
            public void run() {

                // thread T2 locking the R2 resource
                synchronized (R2) {
                    System.out.println("Thread T2 locked -> Resource R2");

                    try {
                        R2.wait(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    // thread T2 locking the R1 resource
                    synchronized (R1) {
                        System.out.println("Thread T2 locked -> Resource R1");
                    }
                }
            }
        };

        // starting both the threads
        T1.start();
        T2.start();
    }


}
