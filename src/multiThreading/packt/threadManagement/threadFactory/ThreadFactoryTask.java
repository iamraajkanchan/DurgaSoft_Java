package multiThreading.packt.threadManagement.threadFactory;

import java.util.concurrent.TimeUnit;

/**
 * Creating threads through a factory
 * */
public class ThreadFactoryTask implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
