package multiThreading.packt.syncUtility.synchronizingTasks;

/**
 * Synchronizing tasks in a common point
 */
public class STGrouper implements Runnable {
    private final STResults results;

    public STGrouper(STResults results) {
        this.results = results;
    }

    @Override
    public void run() {
        int finalResult = 0;
        System.out.println("STGrouper: Processing results...");
        final int[] data = results.getData();
        for (int number : data) {
            finalResult += number;
        }
        System.out.printf("STGrouper: Total result: %d", finalResult);
        ;
    }
}
