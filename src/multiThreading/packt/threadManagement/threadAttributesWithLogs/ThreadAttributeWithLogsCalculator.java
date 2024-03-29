package multiThreading.packt.threadManagement.threadAttributesWithLogs;

/**
 * Getting and setting thread information
 * */
public class ThreadAttributeWithLogsCalculator implements Runnable {
    private final int number;

    public ThreadAttributeWithLogsCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName() ,number, i, number * i);
        }
    }
}
