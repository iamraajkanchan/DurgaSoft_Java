package multiThreading.packt.threadManagement.threadInterruption;

/**
 * Interrupting a thread
 * */
public class ThreadInterruptionPrimeGenerator extends Thread {
    @Override
    public void run() {
        long number = 1L;
        while (true) {
            if (isPrime(number)) {
                System.out.printf("Number %d is Prime\n", number);
            }
            if (isInterrupted()) {
                System.out.println("The Prime Generator has been interrupted.");
                return;
            }
            number++;
        }
    }

    private boolean isPrime(long number) {
        return number % 2 == 0;
    }
}
