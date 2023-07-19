package multiThreading.packt.threadSynchronization.synchronizeWithLock;

/**
 * Synchronizing a block of code with a Lock
 * */
public class SynchronizeWithLockJob implements Runnable {
    private final SynchronizeWithLockPrintQueue printQueue;
    public SynchronizeWithLockJob(SynchronizeWithLockPrintQueue printQueue) {
        this.printQueue = printQueue;
    }
    @Override
    public void run() {
        System.out.printf("Job: %s: Going to print a document\n", Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.printf("Job: %s: The document has been printed\n", Thread.currentThread().getName());
    }
}
