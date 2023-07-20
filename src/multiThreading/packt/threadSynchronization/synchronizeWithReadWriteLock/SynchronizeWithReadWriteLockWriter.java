package multiThreading.packt.threadSynchronization.synchronizeWithReadWriteLock;

import java.util.concurrent.TimeUnit;

/**
 * Synchronize data access with a read/write locks
 */
public class SynchronizeWithReadWriteLockWriter implements Runnable {
    private final SynchronizeWithReadWriteLockPricesInfo pricesInfo;

    public SynchronizeWithReadWriteLockWriter(SynchronizeWithReadWriteLockPricesInfo pricesInfo) {
        this.pricesInfo = pricesInfo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            pricesInfo.setPrices(Math.random() * 100, Math.random() * 100);
            System.out.println("Writer: Prices have been modified.");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
