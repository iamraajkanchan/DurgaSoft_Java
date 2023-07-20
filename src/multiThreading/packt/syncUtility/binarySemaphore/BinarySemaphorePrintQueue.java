package multiThreading.packt.syncUtility.binarySemaphore;

import java.util.concurrent.Semaphore;

/**
 * Controlling concurrent access to a resource
 */
public class BinarySemaphorePrintQueue {
    private final Semaphore semaphore;

    public BinarySemaphorePrintQueue() {
        this.semaphore = new Semaphore(1);
    }

    public void printJob(Object line) {
        try {
            semaphore.acquire();
            final long duration = (long) (Math.random() * 10);
            System.out.printf("PrintQueue - %s: printed %s at %d seconds\n", Thread.currentThread().getName(), line, duration);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        } finally {
            semaphore.release();
        }
    }
}
