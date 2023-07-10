package multiThreading.defogTech.threadLocal.unsafeThread;

import multiThreading.defogTech.threadLocal.StringDateSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThousandUnsafeThreadSimulator {
    public static void main(String... args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        AtomicInteger threadCount = new AtomicInteger();
        Runnable work = () -> {
            for (threadCount.set(0); threadCount.get() < 1000; threadCount.getAndIncrement()) {
                for (int i = 0; i < StringDateSource.getTimings().length; i++) {
                    try {
                        Date birthdate = sdf.parse(StringDateSource.getTimings()[i]);
                        System.out.println(birthdate + " in " + Thread.currentThread().getName());
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("ThreadCount: " + threadCount.get());
            }
        };
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
        fixedThreadPool.submit(work);
        /*
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        cachedThreadPool.submit(work);
        */
        /* The below pool doesn't yield result at the moment. */
        /*
        ExecutorService workStealingPool = Executors.newWorkStealingPool(4);
        workStealingPool.submit(work);
        */
    }
}
