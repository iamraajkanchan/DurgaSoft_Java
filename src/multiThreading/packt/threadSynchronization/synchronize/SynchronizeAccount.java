package multiThreading.packt.threadSynchronization.synchronize;

/**
 * Synchronizing a method
 * */
public class SynchronizeAccount {
    private double balance;
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public synchronized void addAmount(double amount) {
        double temp = balance;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        temp += amount;
        balance = temp;
    }
    public synchronized void subtractAmount(double amount) {
        double temp = balance;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        temp -= amount;
        balance = temp;
    }
}
