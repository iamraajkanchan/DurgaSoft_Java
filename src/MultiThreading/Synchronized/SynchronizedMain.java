package MultiThreading.Synchronized;

public class SynchronizedMain {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedDisplay display = new SynchronizedDisplay();
        display.wish("Dane");
    }
}
