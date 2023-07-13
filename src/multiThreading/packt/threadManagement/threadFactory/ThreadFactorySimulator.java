package multiThreading.packt.threadManagement.threadFactory;

public class ThreadFactorySimulator {
    public static void main(String... args) {
        final ThreadFactoryCustom threadFactory = new ThreadFactoryCustom("ThreadFactoryCustom");
        final ThreadFactoryTask task = new ThreadFactoryTask();
        System.out.println("Starting the threads");
        for (int i = 0; i < 10; i++) {
            final Thread thread = threadFactory.newThread(task);
            thread.start();
        }
        System.out.println("Factory Stats");
        System.out.printf("%s\n", threadFactory.getStats());
    }
}
