package multiThreading.packt.threadSynchronization.synchronizeCondition;

public class SynchronizeConditionProducer implements Runnable {
    private final SynchronizeConditionEventStorage storage;

    public SynchronizeConditionProducer(SynchronizeConditionEventStorage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.set();
        }
    }
}
