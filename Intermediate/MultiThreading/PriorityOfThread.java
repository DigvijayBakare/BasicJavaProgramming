package MultiThreading;

class MyThread1 {

}
public class PriorityOfThread {
    public static void main(String[] args) {
        System.out.println("Minimum priority: "+Thread.MIN_PRIORITY);
        System.out.println("Normal priority: "+Thread.NORM_PRIORITY);
        System.out.println("Maximum priority: "+Thread.MAX_PRIORITY);

        System.out.println("Priority of main thread: "+Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(15);     // RE: java.lang.IllegalArgumentException
        Thread.currentThread().setPriority(7);

        // if we comment above line both main and child thread gets same priority
        // but if we don't comment, main thread has less priority-5 and child thread will have -7

        MyThread1 t = new MyThread1();
        System.out.println("Priority of child thread: "+Thread.currentThread().getPriority());
    }
}
