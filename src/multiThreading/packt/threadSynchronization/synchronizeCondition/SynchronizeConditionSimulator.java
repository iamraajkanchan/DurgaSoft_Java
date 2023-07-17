package multiThreading.packt.threadSynchronization.synchronizeCondition;

public class SynchronizeConditionSimulator {
    public static void main(String... args) {
        final SynchronizeConditionEventStorage storage = new SynchronizeConditionEventStorage();
        final SynchronizeConditionProducer producer = new SynchronizeConditionProducer(storage);
        final Thread producerThread = new Thread(producer);
        final SynchronizeConditionConsumer consumer = new SynchronizeConditionConsumer(storage);
        final Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}
