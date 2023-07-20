package multiThreading.packt.threadSynchronization.synchronizeWithLockConditions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Using multiple conditions in a lock
 */
public class SynchronizeWithLockConditionsBuffer {
    private final Queue<String> buffer;
    private final int maxSize;
    private final ReentrantLock lock;
    private final Condition lines;
    private final Condition space;
    private boolean pendingLines;

    public SynchronizeWithLockConditionsBuffer(int maxSize) {
        this.maxSize = maxSize;
        buffer = new LinkedList<>();
        lock = new ReentrantLock();
        lines = lock.newCondition();
        space = lock.newCondition();
        pendingLines = true;
    }

    public void insert(String line) {
        lock.lock();
        try {
            while (buffer.size() == maxSize) {
                space.await();
            }

            buffer.offer(line);
            // add() will throw an IllegalStateException if no space is currently available in the Queue, otherwise add method will return true.
            // offer() method will return false if the element cannot be inserted due to capacity restrictions.
            System.out.printf("%s: Inserted line: %d\n", Thread.currentThread().getName(), buffer.size());
            lines.signalAll();
        } catch (InterruptedException | IllegalStateException e) {
            e.printStackTrace(System.out);
        } finally {
            lock.unlock();
        }
    }

    public String get() {
        String line = null;
        lock.lock();
        try {
            while (buffer.size() == 0 && hasPendingLines()) {
                lines.await();
            }
            if (hasPendingLines()) {
                line = buffer.poll();
                System.out.printf("%s: Line Read: %d\n", Thread.currentThread().getName(), buffer.size());
                space.signalAll();
            }
        } catch (InterruptedException | IllegalStateException e) {
            e.printStackTrace(System.out);
        }
        return line;
    }

    public boolean hasPendingLines() {
        return pendingLines || buffer.size() > 0;
    }

    public void setPendingLines(boolean pendingLines) {
        this.pendingLines = pendingLines;
    }
}
