package MultiThreading;

/*  Producer consumer problem: -
    Here Producer produces some items and put it in a buffer, till then consumer is in waiting state
    After the buffer gets full it notifies to the consumer to consume the items produced by the consumer    */

class ProducerClass extends Thread {     // defined a Producer who will produce items
    StringBuffer buffer;                // buffer created using StringBuffer class

    ProducerClass() {                   // constructor
        buffer = new StringBuffer(4);       // defined buffer capacity
    }

    @Override
    public void run() {                     // overridden run method for production of items
        synchronized (buffer) {
            for (int i = 0; i < 5; i++) {       // producing 0-4 items in buffer or a resource
                try {
                    buffer.append(i);           // adding items in buffer
                    System.out.println("Producer: " + i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Buffer is full");
            buffer.notify();                // notifying the consumer that buffer is full
        }
    }
}

class ConsumerClass extends Thread {                    // define consumer for consuming the items
    ProducerClass p;                                // instance of producer class

    ConsumerClass(ProducerClass temp) {         // constructor for passing instance if producer class
        p = temp;
    }

    @Override
    public void run() {                         // override run method to consume items produced by producer
        synchronized (p.buffer) {
            try {
                p.buffer.wait();               // will wait till getting the notification from producer
                // we can use it without synchronization
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 5; i++) {              // after getting notification start consuming the items
                System.out.print(p.buffer.charAt(i) + " ");
            }
            System.out.println("\nBuffer is empty");
        }
    }
}

public class ProducerConsumerWithSynchro {
    public static void main(String[] args) {
        ProducerClass p = new ProducerClass();          // object of producer class
        ConsumerClass c = new ConsumerClass(p);         // object of consumer class
        Thread t1 = new Thread(p);                      // producer thread
        Thread t2 = new Thread(c);                      // consumer thread

        // start both the threads
//        t1.start();           // will be stuck in deadlock
        t2.start();             // start second first to create demand for the items
        t1.start();

    }
}
