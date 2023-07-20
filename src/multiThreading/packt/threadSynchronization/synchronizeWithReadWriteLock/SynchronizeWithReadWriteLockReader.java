package multiThreading.packt.threadSynchronization.synchronizeWithReadWriteLock;

/**
 * Synchronize data access with a read/write locks
 */
public class SynchronizeWithReadWriteLockReader implements Runnable {
    private final SynchronizeWithReadWriteLockPricesInfo pricesInfo;

    public SynchronizeWithReadWriteLockReader(SynchronizeWithReadWriteLockPricesInfo pricesInfo) {
        this.pricesInfo = pricesInfo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: Price 1: %f\n", Thread.currentThread().getName(), pricesInfo.getPrice1());
            System.out.printf("%s: Price 2: %f\n", Thread.currentThread().getName(), pricesInfo.getPrice2());
        }
    }
}
