package multiThreading.defogTech.threadLocal.unsafeThread;

import multiThreading.defogTech.threadLocal.safeThread.ThreadLocalSimulator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MultipleUnsafeThreadsSimulator {
    public static void main(String... args) {
        for (int i = 0; i < ThreadLocalSimulator.getTimings().length; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    Date birthdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).parse(ThreadLocalSimulator.getTimings()[finalI]);
                    System.out.println(birthdate);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
