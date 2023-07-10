package multiThreading.packt.chapter1.basics;

public class BasicThreadSimulator {
    public static void main(String... args) {
        final BasicsCalculator calculator = new BasicsCalculator(9);
        final Thread thread = new Thread(calculator);
        thread.start();
    }
}
