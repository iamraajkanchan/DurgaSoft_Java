package multiThreading.defogTech.threadLocal.unsafeThread;

import multiThreading.defogTech.threadLocal.StringDateSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

public class MultipleUnsafeThreadsSimulator {
    public static void main(String... args) {
        AtomicInteger threadCount = new AtomicInteger();
        for (threadCount.set(0); threadCount.get() < StringDateSource.getTimings().length - 1; threadCount.incrementAndGet()) {
            new Thread(() -> {
                try {
                    Date birthdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).parse(StringDateSource.getTimings()[threadCount.get()]);
                    System.out.println(birthdate);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("ThreadCount: " + threadCount);
            }).start();
        }
    }
}
