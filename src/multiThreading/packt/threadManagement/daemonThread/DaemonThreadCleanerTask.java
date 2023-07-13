package multiThreading.packt.threadManagement.daemonThread;

import java.util.Date;
import java.util.Deque;

/**
 * Creating and running a daemon thread
 * */
public class DaemonThreadCleanerTask extends Thread {
    private final Deque<DaemonThreadEvent> deque;
    public DaemonThreadCleanerTask(Deque<DaemonThreadEvent> deque) {
        this.deque = deque;
        setDaemon(true);
        // Because you have to mark the thread as daemon by default that's why the class is extending the Thread class
    }
    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        while(true) {
            Date date = new Date();
            clean(date);
        }
    }

    private void clean(Date date) {
        long difference;
        boolean delete;
        if (deque.size() == 0) {
            return;
        }
        delete = false;
        do {
            DaemonThreadEvent event = deque.getLast();
            difference = date.getTime() - event.getDate().getTime();
            System.out.printf("Cleaner: difference - %d", difference);
            if (difference > 10000) {
                System.out.printf("Cleaner: %s\n", event.getEvent());
                deque.removeLast();
                delete = true;
            }
        } while ( difference > 10000);
        if (delete) {
            System.out.printf("Cleaner: Size of the queue: %d\n", deque.size());
        }
    }
}
