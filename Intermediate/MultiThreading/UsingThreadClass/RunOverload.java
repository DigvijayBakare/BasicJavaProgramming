package MultiThreading.UsingThreadClass;

public class RunOverload extends Thread {
    @Override
    public void run() {
        System.out.println("no arg run method");
    }
    public void run(int a) {
        System.out.println("with arg run method ");
    }
}

class MyThread {
    public static void main(String[] args) {
        RunOverload ro = new RunOverload();
        ro.run();                               // always calls no arg run method or default run method
        ro.run(10);                          // overloaded run acts as normal method
    }
}