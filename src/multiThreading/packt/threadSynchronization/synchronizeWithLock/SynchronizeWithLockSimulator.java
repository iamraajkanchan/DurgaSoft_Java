package multiThreading.packt.threadSynchronization.synchronizeWithLock;

/**
 * Synchronizing a block of code with a Lock
 * */
public class SynchronizeWithLockSimulator {
    public static void main(String... args) {
        final SynchronizeWithLockPrintQueue printQueue = new SynchronizeWithLockPrintQueue();
        final SynchronizeWithLockJob job = new SynchronizeWithLockJob(printQueue);
        final Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(job, "Thread " + i);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
