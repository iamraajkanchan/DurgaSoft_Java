package MultiThreading.Priorities;

public class PrioritiesMain {
    public static void main(String[] args) {
        // System.out.println("Priority of Main Thread: " + Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(11); // Throws Runtime Exception.
        // Thread.currentThread().setPriority(7);
        PrioritiesThread thread = new PrioritiesThread();
        thread.setPriority(10);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}

