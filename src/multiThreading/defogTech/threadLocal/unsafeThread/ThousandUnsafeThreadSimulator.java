package multiThreading.defogTech.threadLocal.unsafeThread;

import multiThreading.defogTech.threadLocal.safeThread.ThreadLocalSimulator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThousandUnsafeThreadSimulator {
    public static void main(String... args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        Runnable work = () -> {
            for (int threadCount = 0; threadCount < 1000; threadCount++) {
                for (int i = 0; i < ThreadLocalSimulator.getTimings().length; i++) {
                    try {
                        Date birthdate = sdf.parse(ThreadLocalSimulator.getTimings()[i]);
                        System.out.println(birthdate + " in " + Thread.currentThread().getName());
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
        fixedThreadPool.submit(work);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        cachedThreadPool.submit(work);
        /* The below pool doesn't work */

        /*
        ExecutorService workStealingPool = Executors.newWorkStealingPool(4);
        workStealingPool.submit(work);
        */
    }
}
