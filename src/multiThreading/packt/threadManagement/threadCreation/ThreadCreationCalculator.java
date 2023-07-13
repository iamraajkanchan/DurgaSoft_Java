package multiThreading.packt.threadManagement.threadCreation;

/**
 * Creating and running a thread
 * */
public class ThreadCreationCalculator implements Runnable {
    private final int number;

    public ThreadCreationCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }
}
