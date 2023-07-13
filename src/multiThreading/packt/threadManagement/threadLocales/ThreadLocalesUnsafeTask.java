package multiThreading.packt.threadManagement.threadLocales;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Using local thread variables
 */
public class ThreadLocalesUnsafeTask implements Runnable {
    @Override
    public void run() {
        Date startDate = new Date();
        System.out.printf("UnsafeTask: Starting Thread: %d : %s\n", Thread.currentThread().threadId(), startDate);
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("UnsafeTask: Thread finished: %d : %s\n", Thread.currentThread().threadId(), startDate);
    }
}
