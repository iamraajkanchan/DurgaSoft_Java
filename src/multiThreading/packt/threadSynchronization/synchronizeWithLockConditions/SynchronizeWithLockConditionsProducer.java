package multiThreading.packt.threadSynchronization.synchronizeWithLockConditions;

/**
 * Using multiple conditions in a lock
 */
public class SynchronizeWithLockConditionsProducer implements Runnable {
    private final SynchronizeWithLockConditionsBuffer buffer;
    private final SynchronizeWithLockConditionsFileMock fileMock;

    public SynchronizeWithLockConditionsProducer(SynchronizeWithLockConditionsBuffer buffer, SynchronizeWithLockConditionsFileMock fileMock) {
        this.buffer = buffer;
        this.fileMock = fileMock;
    }

    @Override
    public void run() {
        buffer.setPendingLines(true);
        while (fileMock.hasMoreLines()) {
            final String line = fileMock.getLine();
            buffer.insert(line);
        }
        buffer.setPendingLines(false);
    }
}
