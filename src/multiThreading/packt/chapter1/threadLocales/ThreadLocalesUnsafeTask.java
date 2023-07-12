package multiThreading.packt.chapter1.threadLocales;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Using local thread variables
 */
public class ThreadLocalesUnsafeTask implements Runnable {
    private Date startDate;
    @Override
    public void run() {
        startDate = new Date();
        System.out.printf("UnsafeTask: Starting Thread: %d : %s\n", Thread.currentThread().threadId(), startDate);
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("UnsafeTask: Thread finished: %d : %s\n", Thread.currentThread().threadId(), startDate);
    }
}
