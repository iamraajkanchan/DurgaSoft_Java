package multiThreading.packt.threadManagement.threadSleepResume;

import java.util.concurrent.TimeUnit;

/**
 * Sleeping and resuming a thread
 * */
public class ThreadSleepResumeSimulator {
    public static void main(String... args) {
        ThreadSleepResumeFileClock fileClock = new ThreadSleepResumeFileClock();
        Thread task = new Thread(fileClock);
        task.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.interrupt();
    }
}

/*
* Output
Wed Jul 12 15:36:18 IST 2023 - is Interrupted: false
Wed Jul 12 15:36:19 IST 2023 - is Interrupted: false
Wed Jul 12 15:36:20 IST 2023 - is Interrupted: false
Wed Jul 12 15:36:21 IST 2023 - is Interrupted: false
Wed Jul 12 15:36:22 IST 2023 - is Interrupted: false
The File Clock is interrupted
Wed Jul 12 15:36:23 IST 2023 - is Interrupted: true
The File Clock is interrupted
Wed Jul 12 15:36:23 IST 2023 - is Interrupted: true
The File Clock is interrupted
Wed Jul 12 15:36:23 IST 2023 - is Interrupted: true
The File Clock is interrupted
Wed Jul 12 15:36:23 IST 2023 - is Interrupted: true
The File Clock is interrupted
Wed Jul 12 15:36:23 IST 2023 - is Interrupted: true
The File Clock is interrupted
* */
