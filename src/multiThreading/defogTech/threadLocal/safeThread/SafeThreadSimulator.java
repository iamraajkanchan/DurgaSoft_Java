package multiThreading.defogTech.threadLocal.safeThread;

import multiThreading.defogTech.threadLocal.StringDateSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SafeThreadSimulator {
    public static void main(String... args) {
        final SimpleDateFormat df = new SafeDateFormatter().get();
        final AtomicInteger threadCount = new AtomicInteger();
        for (threadCount.set(0); threadCount.get() < StringDateSource.getTimings().length - 1; threadCount.incrementAndGet()) {
            try {
                System.out.println(df.parse(StringDateSource.getTimings()[threadCount.get()]));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
