package multiThreading.packt.threadSynchronization.synchronizeWithReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Synchronize data access with a read/write locks
 * */
public class SynchronizeWithReadWriteLockPricesInfo {
    private double price1;
    private double price2;
    private final ReadWriteLock lock;
    public SynchronizeWithReadWriteLockPricesInfo() {
        price1 = 1.0;
        price2 = 2.0;
        lock = new ReentrantReadWriteLock();
    }
    public double getPrice1() {
        lock.readLock().lock();
        final double value = price1;
        lock.readLock().unlock();
        return value;
    }
    public double getPrice2() {
        lock.readLock().lock();
        final double value = price2;
        lock.readLock().unlock();
        return value;
    }
    public void setPrices(double price1, double price2) {
        lock.writeLock().lock();
        this.price1 = price1;
        this.price2 = price2;
        lock.writeLock().unlock();
    }
}
