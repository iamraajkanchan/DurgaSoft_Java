package multiThreading.packt.threadSynchronization.synchronizeWithReadWriteLock;

import java.util.Arrays;

/**
 * Synchronizing data access with read/write locks
 */
public class SynchronizeWithReadWriteLockSimulator {
    public static void main(String... args) {
        final SynchronizeWithReadWriteLockPricesInfo pricesInfo = new SynchronizeWithReadWriteLockPricesInfo();
        final SynchronizeWithReadWriteLockReader reader = new SynchronizeWithReadWriteLockReader(pricesInfo);
        final Thread[] initialReadThreads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            final Thread readThread = new Thread(reader);
            initialReadThreads[i] = readThread;
        }
        final SynchronizeWithReadWriteLockWriter writer = new SynchronizeWithReadWriteLockWriter(pricesInfo);
        final Thread writeThread = new Thread(writer);
        writeThread.start();
        Arrays.stream(initialReadThreads).forEach(Thread::start);
        System.out.println("===================================================================================");
        final Thread updatedWriteThread = new Thread(writer);
        updatedWriteThread.start();
        final Thread[] updatedReadThreads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            final Thread readThread = new Thread(reader);
            updatedReadThreads[i] = readThread;
        }
        Arrays.stream(updatedReadThreads).forEach(Thread::start);
    }
}
