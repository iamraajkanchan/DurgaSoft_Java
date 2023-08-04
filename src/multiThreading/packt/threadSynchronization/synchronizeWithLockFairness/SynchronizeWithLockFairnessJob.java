package multiThreading.packt.threadSynchronization.synchronizeWithLockFairness;

/**
 * Modifying lock fairness
 */
public class SynchronizeWithLockFairnessJob implements Runnable {
    private final SynchronizeWithLockFairnessPrintQueue printQueue;

    public SynchronizeWithLockFairnessJob(SynchronizeWithLockFairnessPrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        System.out.printf("Job: %s: Going to print a document\n", Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.printf("Job: %s: The document has been printed\n", Thread.currentThread().getName());
    }
}
