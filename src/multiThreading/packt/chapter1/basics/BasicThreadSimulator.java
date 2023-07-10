package multiThreading.packt.chapter1.basics;

public class BasicThreadSimulator {
    public static void main(String... args) {
        for (int i = 1; i <= 10; i++) {
            final BasicsCalculator calculator = new BasicsCalculator(9, i);
            final Thread thread = new Thread(calculator);
            thread.start();
        }
    }
}
