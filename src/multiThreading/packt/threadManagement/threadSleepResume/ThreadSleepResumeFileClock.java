package multiThreading.packt.threadManagement.threadSleepResume;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Sleeping and resuming a thread
 * */
public class ThreadSleepResumeFileClock implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s - is interrupted: %b\n", new Date(), Thread.currentThread().isInterrupted());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("The File Clock is interrupted");
            }
        }
    }
}
