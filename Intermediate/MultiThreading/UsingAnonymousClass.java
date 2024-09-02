package MultiThreading;

public class UsingAnonymousClass {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<= 5; i++) {
                    System.out.println("HI");
                    try {Thread.sleep(2000);} catch (Exception e) {}
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<= 5; i++) {
                    System.out.println("HELLO");
                    try {Thread.sleep(2000);} catch (Exception e) {}
                }
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
