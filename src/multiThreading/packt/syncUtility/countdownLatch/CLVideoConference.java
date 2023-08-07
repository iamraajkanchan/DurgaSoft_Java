package multiThreading.packt.syncUtility.countdownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Add Chapter Name
 * */
public class CLVideoConference implements Runnable {
    private final CountDownLatch controller;
    /**
     * Waiting for multiple concurrent events
     * */
    public CLVideoConference(int number) {
        controller = new CountDownLatch(number);
    }

    public void arrive(String name) {
        System.out.printf("%s has arrived\n", name);
        controller.countDown();
        System.out.printf("CLVideoConference: Waiting for %d participants.\n", controller.getCount());
    }

    @Override
    public void run() {
        System.out.printf("CLVideoConference: Initialization: %d participants\n", controller.getCount());
        try {
            controller.await();
            System.out.println("CLVideoConference: All the participants have come");
            System.out.println("CLVideoConference: Let's start");
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
