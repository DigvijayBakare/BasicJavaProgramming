package MultiThreading.Synchronization;

// without synchronization

class Display {
    public static void wish(String name) {
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

class MyThreadT extends Thread {
    Display d;
    String name;

    MyThreadT(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class SynchronisedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThreadT t1 = new MyThreadT(d,"Dhoni");
        MyThreadT t2 = new MyThreadT(d,"YuvRaj");
        MyThreadT t3 = new MyThreadT(d,"Ravi");
        MyThreadT t4 = new MyThreadT(d,"Rahul");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        /*  Good Morning: Good Morning: Good Morning: Good Morning: Ravi
            Good Morning: YuvRaj
            Good Morning: Rahul
            Good Morning: Dhoni
            Good Morning: Dhoni
            Good Morning: Rahul
            Good Morning: YuvRaj
            Good Morning: Ravi
            Good Morning: Rahul
            Good Morning: Ravi
            Good Morning: YuvRaj
            Good Morning: Dhoni
            Good Morning: Ravi
            Good Morning: Dhoni
            Good Morning: Rahul
            Good Morning: YuvRaj
            Good Morning: Dhoni
            Rahul
            YuvRaj
            Ravi                                    */
    }
}