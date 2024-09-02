package MultiThreading.Synchronization;

class DisplayMethod {
    public void wish(String name) {
        ;;;;;;;;;;;;;;;;;;;;;;;// 1 lakh lines of code
        /*synchronized (this){
            for (int i = 0; i < 5; i++) {
                System.out.print("Good morning: ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    ie.getMessage();
                }
                System.out.println(name);
            }
        }*/

        // using class level lock for two objects to get regular output
        synchronized (DisplayMethod.class){
            for (int i = 0; i < 5; i++) {
                System.out.print("Good morning: ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    ie.getMessage();
                }
                System.out.println(name);
            }
        }
        ;;;;;;;;;;;;;;;;;;;;;;;// 1 lakh lines of code

        /*int x = 10;
        synchronized (x) {
            // block of code
        }*/
    }
}
class MyThreadD extends Thread {
    DisplayMethod dm;
    String name;
    MyThreadD(DisplayMethod dm, String name) {
        this.dm = dm;
        this.name = name;
    }
    @Override
    public void run() {
        dm.wish(name);
    }
}
public class SynchronisedBlock {
    public static void main(String[] args) {
        DisplayMethod dm1 = new DisplayMethod();
        DisplayMethod dm2 = new DisplayMethod();
        // when we create two objects we'll get mixed output because it will be executed simultaneously
        MyThreadD t1 = new MyThreadD(dm1,"Dhoni");
//        MyThreadD t2 = new MyThreadD(dm1,"YuvRaj");
        MyThreadD t2 = new MyThreadD(dm2,"YuvRaj");
        t1.start();
        t2.start();
    }
}
