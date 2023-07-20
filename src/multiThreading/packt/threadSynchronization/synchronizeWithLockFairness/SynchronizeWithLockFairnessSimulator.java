package multiThreading.packt.threadSynchronization.synchronizeWithLockFairness;

import java.util.Arrays;

/**
 * Modifying lock fairness
 */
public class SynchronizeWithLockFairnessSimulator {
    public static void main(String... args) {
        final SynchronizeWithLockFairnessPrintQueue printQueue = new SynchronizeWithLockFairnessPrintQueue();
        final SynchronizeWithLockFairnessJob job = new SynchronizeWithLockFairnessJob(printQueue);
        final Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            final Thread thread = new Thread(job);
            threads[i] = thread;
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
