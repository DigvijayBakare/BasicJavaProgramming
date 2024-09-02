package MultiThreading.UsingThreadClass;

// This is how we define a thread in java

public class ThreadDefining extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
    }
}

class Demo {
    public static void main(String[] args) {
        ThreadDefining t = new ThreadDefining();
//        t.start();                          // thread class start method
        // no guarantee of output
        t.run();                            // acts as a normal method call
        // guaranteed output
        for (int i=0; i<5;i++){
            System.out.print("In main method "+i+"\n");
        }
    }
}