package MultiThreading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("This line is executed by thread: "+Thread.currentThread().getName());
    }
}

public class NameOfAThread {
    public static void main(String[] args) {
        System.out.println("Name of main thread: " + Thread.currentThread().getName());
        MyThread t = new MyThread();
        System.out.println("Name of child thread: " + t.getName());
        t.setName("Child Thread");
        System.out.println("New name of child thread: " + t.getName());
        Thread.currentThread().setName("Main Thread");
        System.out.println("New name of main thread: " + Thread.currentThread().getName());
//        System.out.println(10/0);
        t.start();
        System.out.println("This line is executed by thread: " + Thread.currentThread().getName());
    }
}
