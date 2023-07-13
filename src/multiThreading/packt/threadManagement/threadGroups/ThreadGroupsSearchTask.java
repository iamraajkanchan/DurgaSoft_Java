package multiThreading.packt.threadManagement.threadGroups;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ThreadGroupsSearchTask implements Runnable {
    private final ThreadGroupsResult result;
    public ThreadGroupsSearchTask(ThreadGroupsResult result) {
        this.result = result;
    }
    @Override
    public void run() {
        final String threadName = Thread.currentThread().getName();
        System.out.printf("Thread %s: Start\n", threadName);
        try {
            doTask();
            result.setName(threadName);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }

    private void doTask() throws InterruptedException {
        final Random random = new Random(new Date().getTime());
        final int value = (int) (random.nextDouble() * 100);
        System.out.printf("Thread %s: %d\n", Thread.currentThread().getName(), value);
        TimeUnit.SECONDS.sleep(value);
    }
}
