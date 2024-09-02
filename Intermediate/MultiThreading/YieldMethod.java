package MultiThreading;

class MyThread123 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
public class YieldMethod {
    public static void main(String[] args) {
        MyThread123 t = new MyThread123();
        t.start();
//        Thread.yield();
        for (int i=0; i<5; i++){
            System.out.println("Main Thread ");
        }
    }
}
