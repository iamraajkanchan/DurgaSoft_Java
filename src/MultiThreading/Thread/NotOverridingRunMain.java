package MultiThreading.Thread;

public class NotOverridingRunMain {
    public static void main(String[] args) {
        NotOverridingRunThread thread = new NotOverridingRunThread();
        thread.start();
    }
}
