package multiThreading.packt.syncUtility.countingSemaphore;

/**
 * Controlling concurrent access to multiple copies of a resource
 */
public class CountingSemaphoreJob implements Runnable {
    private final CountingSemaphorePrintQueue printQueue;

    public CountingSemaphoreJob(CountingSemaphorePrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        System.out.printf("%s: Going to print a job\n", Thread.currentThread().getName());
        printQueue.printJob("Hello from Binary Semaphore!");
        System.out.printf("%s: The line has been printed\n", Thread.currentThread().getName());
    }
}
