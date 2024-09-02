package MultiThreading;

// Producer - consumer problem  => without using synchronization

class Producer extends Thread {
    StringBuffer buffer;
    Producer() {
        buffer = new StringBuffer(4);
    }
    @Override
    public void run() {
        for (int i=0; i<4; i++) {
            try {
                buffer.append(i);
                System.out.println("Producer: "+i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Buffer is full");
        Consumer c = new Consumer(this);
    }
}

class Consumer extends Thread {
    Producer p;
    Thread t2;
    Consumer(Producer temp) {
        p = temp;
        t2 = new Thread(this);
        t2.start();
    }
    @Override
    public void run() {
        try {
            for (int i=0; i<4; i++) {
                System.out.print(p.buffer.charAt(i)+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nBuffer is empty");
    }
}

public class ProducerConsumerThreadEfficiency {
    public static void main(String[] args) {
        Producer p = new Producer();
        Thread t = new Thread(p);
        t.start();
    }
}
