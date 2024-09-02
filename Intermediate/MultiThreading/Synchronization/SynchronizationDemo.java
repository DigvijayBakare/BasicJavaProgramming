package MultiThreading.Synchronization;

// without synchronization

class DisplayNew {
    public static synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(name);
        }
    }
}

class MyThreadT1 extends Thread {
    DisplayNew d1;
    String name;

    MyThreadT1(DisplayNew d1, String name) {
        this.d1 = d1;
        this.name = name;
    }
    @Override
    public void run() {
        d1.wish(name);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        DisplayNew a1 = new DisplayNew();
        DisplayNew a2 = new DisplayNew();

        MyThreadT1 t1 = new MyThreadT1(a1,"Dhoni");
//        MyThreadT1 t2 = new MyThreadT1(a1,"YuvRaj");
        MyThreadT1 t2 = new MyThreadT1(a2,"YuvRaj");
        // if we add this thread even though our wish method is synchronised we'll get mixed output because threads are operating on different java object

        t1.start();
        t2.start();

        /*  Good Morning: Dhoni
            Good Morning: Dhoni
            Good Morning: Dhoni
            Good Morning: Dhoni
            Good Morning: Dhoni
            Good Morning: YuvRaj
            Good Morning: YuvRaj
            Good Morning: YuvRaj
            Good Morning: YuvRaj
            Good Morning: YuvRaj                                   */
    }
}