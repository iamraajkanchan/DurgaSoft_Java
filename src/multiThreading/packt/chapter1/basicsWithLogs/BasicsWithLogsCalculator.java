package multiThreading.packt.chapter1.basicsWithLogs;

public class BasicsWithLogsCalculator implements Runnable {
    private final int number;

    public BasicsWithLogsCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName() ,number, i, number * i);
        }
    }
}
