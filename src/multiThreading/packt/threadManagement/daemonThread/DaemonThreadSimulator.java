package multiThreading.packt.threadManagement.daemonThread;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Creating and running a daemon thread
 */
public class DaemonThreadSimulator {
    public static void main(String... args) {
        Deque<DaemonThreadEvent> deque = new ArrayDeque<>();
        DaemonThreadWriterTask writerTask = new DaemonThreadWriterTask(deque);
        final Thread writingThread = new Thread(writerTask);
        writingThread.start();
        DaemonThreadCleanerTask cleanerTask = new DaemonThreadCleanerTask(deque);
        cleanerTask.start();
    }
}
