package multiThreading.packt.chapter1.basics;

public class BasicsCalculator implements Runnable {

    private final int number;

    public BasicsCalculator(int number) {
        this.number = number;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }
}
