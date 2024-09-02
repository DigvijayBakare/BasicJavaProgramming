package MultiThreading.UsingThreadClass;

class Producing extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < MonitorA.maxSize; i++) {                                      // MonitorA.n < MonitorA.maxSize
            try {
                ProducerConsumerMulti.monitor.insert();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consuming extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < MonitorA.maxSize; i++) {                                         //  MonitorA.n == MonitorA.maxSize
            try {
                ProducerConsumerMulti.monitor.remove();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MonitorA {
     static int n;
     static int maxSize;

    public MonitorA(int maxSize) {
        n = 0;
        this.maxSize = maxSize;
    }

    synchronized void insert() throws InterruptedException {
        while (n == maxSize) wait();

        System.out.println("Producer: " + n);
        n++;
//        if (n == maxSize)
        notify();
    }

    synchronized void remove() throws InterruptedException {
        while (n == 0) wait();
        System.out.println("Consumer: " + n);
//        if (n == maxSize)
        n--;
        notify();
    }
}

public class ProducerConsumerMulti {
    static MonitorA monitor;

    public ProducerConsumerMulti(int maxSize) {
        monitor = new MonitorA(maxSize);
        new Producing().start();
        new Producing().start();
        new Producing().start();

        new Consuming().start();
        new Consuming().start();
        new Consuming().start();
    }

    public static void main(String[] args) {
//        int maxSize = 10;
//        int maxProduce = 20;
//        int maxConsume = 20;
        ProducerConsumerMulti pc = new ProducerConsumerMulti(10);
    }
}
