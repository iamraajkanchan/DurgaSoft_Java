package multiThreading.packt.threadSynchronization.synchronizeWithLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Synchronizing a block of code with a Lock
 * */
public class SynchronizeWithLockPrintQueue {
    private final Lock queueLock = new ReentrantLock();

    public void printJob(Object document) {
        queueLock.lock();
        try {
            long duration = (long) (Math.random() * 1000);
            System.out.printf("%s: PrintQueue: Printing a Job during %d seconds\n", Thread.currentThread().getName(), duration / 1000);
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        } finally {
            queueLock.unlock();
        }
    }
}
