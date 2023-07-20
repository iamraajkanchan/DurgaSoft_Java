package multiThreading.packt.threadSynchronization.synchronizeWithLockConditions;


/**
 * Using multiple conditions in a lock
 */
public class SynchronizeWithLockConditionsConsumer implements Runnable {
    private final SynchronizeWithLockConditionsBuffer buffer;

    public SynchronizeWithLockConditionsConsumer(SynchronizeWithLockConditionsBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (buffer.hasPendingLines()) {
            processLine(buffer.get());
        }
    }

    private void processLine(String line) {
        try {
            System.out.printf("%s consuming %s\n", Thread.currentThread().getName(), line);
            long duration = (long) (Math.random() * 100);
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
