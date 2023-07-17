package multiThreading.packt.threadSynchronization.synchronizeCondition;

public class SynchronizeConditionConsumer implements Runnable {
    private final SynchronizeConditionEventStorage storage;

    public SynchronizeConditionConsumer(SynchronizeConditionEventStorage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.get();
        }
    }
}
