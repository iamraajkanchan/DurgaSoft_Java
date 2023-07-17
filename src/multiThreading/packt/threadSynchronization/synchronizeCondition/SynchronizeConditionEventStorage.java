package multiThreading.packt.threadSynchronization.synchronizeCondition;

import java.util.*;

/**
 * Using conditions in synchronized queue
 * */
public class SynchronizeConditionEventStorage {
    private final int maxSize;
    private final Queue<Date> storage;
    public SynchronizeConditionEventStorage() {
        this.maxSize = 10;
        this.storage = new LinkedList<>() {
        };
    }
    public synchronized void set() {
        while(storage.size() == maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
            storage.offer(new Date());
            System.out.printf("Set : %d", storage.size());
            notifyAll();
        }
    }
    public synchronized void get() {
        while(storage.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
            System.out.printf("");
            notifyAll();
        }
    }
}
