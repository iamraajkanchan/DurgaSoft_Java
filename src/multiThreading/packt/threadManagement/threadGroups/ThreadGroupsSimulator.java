package multiThreading.packt.threadManagement.threadGroups;

import java.util.concurrent.TimeUnit;

public class ThreadGroupsSimulator {
    public static void main(String... args) {
        final ThreadGroup threadGroup = new ThreadGroup("Searcher");
        final ThreadGroupsResult result = new ThreadGroupsResult();
        final ThreadGroupsSearchTask searchTask = new ThreadGroupsSearchTask(result);
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
