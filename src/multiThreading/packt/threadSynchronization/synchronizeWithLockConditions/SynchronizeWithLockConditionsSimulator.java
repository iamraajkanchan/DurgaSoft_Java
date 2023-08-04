package multiThreading.packt.threadSynchronization.synchronizeWithLockConditions;

import java.util.Arrays;

/**
 * Using multiple conditions in a lock
 */
public class SynchronizeWithLockConditionsSimulator {
    public static void main(String... args) {
        final SynchronizeWithLockConditionsFileMock fileMock = new SynchronizeWithLockConditionsFileMock(100, 10);
        final SynchronizeWithLockConditionsBuffer buffer = new SynchronizeWithLockConditionsBuffer(20);
        final SynchronizeWithLockConditionsProducer producer = new SynchronizeWithLockConditionsProducer(buffer, fileMock);
        final Thread producerThread = new Thread(producer, "Producer");
        final Thread[] consumerThreads = new Thread[3];
        for (int i = 0; i < 3; i++) {
            final SynchronizeWithLockConditionsConsumer consumer = new SynchronizeWithLockConditionsConsumer(buffer);
            final Thread consumerThread = new Thread(consumer, "Consumer " + i);
            consumerThreads[i] = consumerThread;
        }
        producerThread.start();
        Arrays.stream(consumerThreads).forEach(Thread::start);
    }
}
