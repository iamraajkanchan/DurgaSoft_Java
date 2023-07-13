package multiThreading.packt.threadSynchronization.synchronize;

/**
 * Synchronize a method
 */
public class SynchronizeSimulator {
    public static void main(String... args) {
        final SynchronizeAccount account = new SynchronizeAccount();
        account.setBalance(1000);
        System.out.printf("Account : Initial Balance : %f\n", account.getBalance());
        final SynchronizeCompany company = new SynchronizeCompany(account);
        final Thread companyWork = new Thread(company);
        final SynchronizeBank bank = new SynchronizeBank(account);
        final Thread bankWork = new Thread(bank);
        companyWork.start();
        bankWork.start();
        try {
            companyWork.join();
            bankWork.join();
            System.out.printf("Account : Final Balance : %f\n", account.getBalance());
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
