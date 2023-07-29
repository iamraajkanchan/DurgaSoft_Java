package multiThreading.packt.syncUtility.countingSemaphore;

import java.util.Arrays;
/**
 * Controlling concurrent access to multiple copies of a resource
 * */
public class CountingSemaphoreSimulator {
    public static void main(String... args) {
        final CountingSemaphorePrintQueue printQueue = new CountingSemaphorePrintQueue();
        final CountingSemaphoreJob printJob = new CountingSemaphoreJob(printQueue);
        final Thread[] printThreads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            final Thread printThread = new Thread(printJob, "Thread " + i);
            printThreads[i] = printThread;
        }
        Arrays.stream(printThreads).forEach(Thread::start);
    }
}
