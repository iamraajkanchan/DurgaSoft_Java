package multiThreading.packt.chapter1.basics;

public class BasicsCalculator implements Runnable {

    private final int number;
    private final int multiplier;

    public BasicsCalculator(int number, int multiplier) {
        this.number = number;
        this.multiplier = multiplier;
    }


    @Override
    public void run() {
        System.out.printf("%d * %d = %d\n", number, multiplier, number * multiplier);
    }
}
