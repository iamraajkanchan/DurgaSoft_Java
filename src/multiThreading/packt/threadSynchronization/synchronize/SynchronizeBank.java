package multiThreading.packt.threadSynchronization.synchronize;

/**
 * Synchronize a method
 */
public class SynchronizeBank implements Runnable {
    private final SynchronizeAccount account;
    public SynchronizeBank(SynchronizeAccount account) {
        this.account = account;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.subtractAmount(1000);
        }
    }
}
