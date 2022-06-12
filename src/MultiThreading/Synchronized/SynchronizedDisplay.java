package MultiThreading.Synchronized;

public class SynchronizedDisplay {
    public void wish(String name) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
            Thread.sleep(1000);
            System.out.println();
        }
    }
}
