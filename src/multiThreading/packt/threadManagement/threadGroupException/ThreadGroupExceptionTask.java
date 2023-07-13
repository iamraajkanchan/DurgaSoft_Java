package multiThreading.packt.threadManagement.threadGroupException;

import java.util.Random;

public class ThreadGroupExceptionTask implements Runnable {
    @Override
    public void run() {
        final Random random = new Random(Thread.currentThread().threadId());
        while (true) {
            final int result = 1000 / (int) (random.nextDouble() * 1000);
            System.out.printf("%d : %f\n", Thread.currentThread().threadId(), result);
            if (Thread.currentThread().isInterrupted()) {
                System.out.printf("%d : Interrupted\n", Thread.currentThread().threadId());
                return;
            }
        }
    }
}
