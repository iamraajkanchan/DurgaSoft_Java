package multiThreading.defogTech.threadLocal.unsafeThread;

import multiThreading.defogTech.threadLocal.safeThread.ThreadLocalSimulator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TwoUnsafeThreadsSimulator {

    public static void main(String... args) {

        new Thread(() -> {
            try {
                Date birthDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).parse(ThreadLocalSimulator.getTimings()[0]);
                System.out.println(birthDate);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                Date birthDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).parse(ThreadLocalSimulator.getTimings()[1]);
                System.out.println(birthDate);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
