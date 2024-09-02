package MultiThreading;

class MyThread12 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Child Thread");
        }
    }
}
public class Priority2 {
    public static void main(String[] args) {
        MyThread123 t = new MyThread123();
        t.setPriority(1);                      // priority sett for thread t or child thread
        // if we comment above line both main and child thread gets same priority, and we cannot determine the output
        // but if we don't comment, main thread has less priority, so we can have exact output
        t.start();
        for (int i=0; i<5; i++){
            System.out.println("Main Thread");
        }
    }
}
