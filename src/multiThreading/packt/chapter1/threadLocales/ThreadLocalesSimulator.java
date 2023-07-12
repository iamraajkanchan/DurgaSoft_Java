package multiThreading.packt.chapter1.threadLocales;

import java.util.concurrent.TimeUnit;

/**
 * Using local thread variables
 */
public class ThreadLocalesSimulator {
    public static void main(String... args) {
        final ThreadLocalesUnsafeTask unsafeTask = new ThreadLocalesUnsafeTask();
        for (int i = 0; i < 10; i++) {
            final Thread thread = new Thread(unsafeTask);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        final ThreadLocalesSafeTask safeTask = new ThreadLocalesSafeTask();
        for (int i = 0; i < 10; i++) {
            final Thread thread = new Thread(safeTask);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
