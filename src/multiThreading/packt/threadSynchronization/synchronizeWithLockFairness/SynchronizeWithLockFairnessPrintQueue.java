package multiThreading.packt.threadSynchronization.synchronizeWithLockFairness;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Modifying lock fairness
 */
public class SynchronizeWithLockFairnessPrintQueue {
    private final Lock queueLock = new ReentrantLock(true);

    public void printJob(Object document) {
        queueLock.lock();
        try {
            final long duration = (long) (Math.random() * 10000);
            System.out.printf("%s PrintQueue: Printing a job during %d seconds\n", Thread.currentThread().getName(), duration / 1000);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        } finally {
            queueLock.unlock();
        }
        queueLock.lock();
        try {
            final long duration = (long) (Math.random() * 10000);
            System.out.printf("%s PrintQueue: Printing a job during %d seconds\n", Thread.currentThread().getName(), duration / 1000);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        } finally {
            queueLock.unlock();
        }
    }
}
