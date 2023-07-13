package multiThreading.packt.threadSynchronization.synchronize;

/**
 * Synchronize a method
 */
public class SynchronizeCompany implements Runnable {
    private final SynchronizeAccount account;
    public SynchronizeCompany(SynchronizeAccount account) {
        this.account = account;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.addAmount(1000);
        }
    }
}
