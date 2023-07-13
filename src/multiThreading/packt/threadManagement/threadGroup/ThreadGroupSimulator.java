package multiThreading.packt.threadManagement.threadGroup;

import java.util.concurrent.TimeUnit;

/**
 * Grouping threads into a group
 * */
public class ThreadGroupSimulator {
    public static void main(String... args) {
        final ThreadGroup threadGroup = new ThreadGroup("Searcher");
        final ThreadGroupResult result = new ThreadGroupResult();
        final ThreadGroupSearchTask searchTask = new ThreadGroupSearchTask(result);
        for (int i = 0; i < 5; i++) {
            final Thread thread = new Thread(threadGroup, searchTask);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }
        System.out.printf("Number of threads: %d\n", threadGroup.activeCount());
        System.out.println("Information about the Thread Group");
        threadGroup.list();
        final Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
        for (int i = 0; i < threadGroup.activeCount(); i++) {
            System.out.printf("Thread %s: %s\n", threads[i].getName(), threads[i].getState());
        }
        waitFinish(threadGroup);
        threadGroup.interrupt();
    }

    private static void waitFinish(ThreadGroup threadGroup) {
        while (threadGroup.activeCount() > 9) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
