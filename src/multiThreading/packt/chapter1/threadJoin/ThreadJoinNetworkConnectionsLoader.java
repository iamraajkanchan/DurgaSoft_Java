package multiThreading.packt.chapter1.threadJoin;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ThreadJoinNetworkConnectionsLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Beginning network connections loading: %s\n", new Date());
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Network Connections loading has finished: %s - state: %s\n", new Date(), Thread.currentThread().getState());
    }
}
