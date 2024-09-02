package MultiThreading;

public class UsingLambdaExpression {
    /*public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("HI");
                try {Thread.sleep(2000);} catch (Exception e) {}
            }

        };
        Runnable r2 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("HELLO");
                try {Thread.sleep(2000);} catch (Exception e) {}
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }*/

    // or we can write like this
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("HI");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        },"Hi Thread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("HELLO");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
            },"Hello Thread");
        t1.start();
        t2.start();
        //check if thread t1 is alive or not
        System.out.println("Is t1 alive: "+t1.isAlive());
        t1.join();
        t2.join();
        System.out.println("Is t1 alive: "+t1.isAlive());       // completed its task and is dead now
        System.out.println("By");
    }
}
