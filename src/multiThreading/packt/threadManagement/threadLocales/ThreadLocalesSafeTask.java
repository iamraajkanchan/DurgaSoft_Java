package multiThreading.packt.threadManagement.threadLocales;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Using local thread variables
 */
public class ThreadLocalesSafeTask implements Runnable {
    private ThreadLocal<Date> startDate = ThreadLocal.withInitial(Date::new);

    @Override
    public void run() {
        System.out.printf("SafeTask: Starting Thread: %d : %s\n", Thread.currentThread().threadId(), startDate.get());
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("SafeTask: Thread finished: %d : %s\n", Thread.currentThread().threadId(), startDate.get());
    }
}
