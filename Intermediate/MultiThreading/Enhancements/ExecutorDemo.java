package MultiThreading.Enhancements;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
    String name;
    PrintJob(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name+" job started by Thread: "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name+" job completed by Thread: "+Thread.currentThread());
    }
}
public class ExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] job = {
                new PrintJob("Job_1"),new PrintJob("Job_2"),
                new PrintJob("Job_3"),new PrintJob("Job_4"),
                new PrintJob("Job_5"),new PrintJob("Job_6"),
        };
//        ExecutorService service = Executors.newFixedThreadPool(1);
        // here only one thread is responsible for executing all the six thread by sequence one by one

        ExecutorService service = Executors.newFixedThreadPool(3);
        // here we have pool of 6 threads with which we can reduce the time and execute the jobs parallelly
        for (PrintJob j : job) {
            service.submit(j);
        }
        service.shutdown();
    }
}
