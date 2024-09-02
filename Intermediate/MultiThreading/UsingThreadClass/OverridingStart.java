package MultiThreading.UsingThreadClass;

public class OverridingStart extends Thread{
    @Override
    public void start() {
        super.start();              // Thread class start method
        System.out.println("Start method");
    }
    @Override
    public void run() {
        System.out.println("Run method");
    }
}

class StartOverTest {
    public static void main(String[] args) {
        OverridingStart os = new OverridingStart();
        os.start();                         // acts as normal start method, we'll not get run method implementation
        System.out.println("Main method");
    }
}