package multiThreading.packt.threadManagement.daemonThread;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/**
 * Creating and running a daemon thread
 */
public class DaemonThreadWriterTask implements Runnable {
    private final Deque<DaemonThreadEvent> deque;

    public DaemonThreadWriterTask(Deque<DaemonThreadEvent> deque) {
        this.deque = deque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            DaemonThreadEvent event = new DaemonThreadEvent();
            event.setDate(new Date());
            event.setEvent(String.format("The thread %d has generated an event", Thread.currentThread().threadId()));
            System.out.printf("WriterTask - Event: %s $$$$$ Date: %s\n", event.getEvent(), event.getDate());
            deque.addFirst(event);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("DaemonThreadWriterTask is interrupted");
            }
        }
    }
}
