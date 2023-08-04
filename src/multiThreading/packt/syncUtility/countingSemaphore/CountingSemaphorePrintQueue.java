package multiThreading.packt.syncUtility.countingSemaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Controlling concurrent access to multiple copies of a resource
 */
public class CountingSemaphorePrintQueue {
    private final Semaphore semaphore;
    private final boolean[] freePrinters;
    private final Lock lockPrinters;

    public CountingSemaphorePrintQueue() {
        semaphore = new Semaphore(3);
        freePrinters = new boolean[3];
        for (int i = 0; i < 3; i++) {
            freePrinters[i] = true;
        }
        lockPrinters = new ReentrantLock();
    }

    public void printJob(Object line) {
        try {
            semaphore.acquire();
            final int assignedPrinter = getPrinter();
            long duration = (long) (Math.random() * 10);
            System.out.printf("%s: CountingSemaphorePrintQueue: Printing a Job in Printer %d during %d seconds\n", Thread.currentThread().getName(), assignedPrinter, duration);
            TimeUnit.SECONDS.sleep(duration);
            freePrinters[assignedPrinter] = true;
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        } finally {
            semaphore.release();
        }
    }

    private int getPrinter() {
        int result = -1;
        try {
            lockPrinters.lock();
            for (int i = 0; i < freePrinters.length; i++) {
                if (freePrinters[i]) {
                    result = i;
                    freePrinters[i] = false;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            lockPrinters.unlock();
        }
        return result;
    }
}
