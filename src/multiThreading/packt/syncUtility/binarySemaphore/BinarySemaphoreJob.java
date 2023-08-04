package multiThreading.packt.syncUtility.binarySemaphore;

/**
 * Controlling concurrent access to a resource
 */
public class BinarySemaphoreJob implements Runnable {
    private final BinarySemaphorePrintQueue printQueue;

    public BinarySemaphoreJob(BinarySemaphorePrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        System.out.printf("%s: Going to print a job\n", Thread.currentThread().getName());
        printQueue.printJob("Hello from Binary Semaphore!");
        System.out.printf("%s: The line has been printed\n", Thread.currentThread().getName());
    }
}
