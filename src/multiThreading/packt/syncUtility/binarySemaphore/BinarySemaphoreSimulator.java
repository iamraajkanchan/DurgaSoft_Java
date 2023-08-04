package multiThreading.packt.syncUtility.binarySemaphore;

import java.util.Arrays;

/**
 * Controlling concurrent access to a resource
 */
public class BinarySemaphoreSimulator {
    public static void main(String... args) {
        final BinarySemaphorePrintQueue printQueue = new BinarySemaphorePrintQueue();
        final BinarySemaphoreJob printJob = new BinarySemaphoreJob(printQueue);
        final Thread[] printThreads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            final Thread printThread = new Thread(printJob, "Thread " + i);
            printThreads[i] = printThread;
        }
        Arrays.stream(printThreads).forEach(Thread::start);
    }
}
