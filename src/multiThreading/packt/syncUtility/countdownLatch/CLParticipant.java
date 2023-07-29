package multiThreading.packt.syncUtility.countdownLatch;

import java.util.concurrent.TimeUnit;

/**
 * Waiting for multiple concurrent events
 */
public class CLParticipant implements Runnable {
    private final CLVideoConference conference;
    private final String name;

    public CLParticipant(CLVideoConference conference, String name) {
        this.conference = conference;
        this.name = name;
    }

    @Override
    public void run() {
        long duration = (long) (Math.random() * 10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        conference.arrive(name);
    }
}
