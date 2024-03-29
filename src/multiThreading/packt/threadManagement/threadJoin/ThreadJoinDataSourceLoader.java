package multiThreading.packt.threadManagement.threadJoin;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Waiting for the finalization of a thread
 * */
public class ThreadJoinDataSourceLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Beginning data source loading: %s\n", new Date());
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Data source loading has finished: %s - state: %s\n", new Date(), Thread.currentThread().getState());
    }
}
