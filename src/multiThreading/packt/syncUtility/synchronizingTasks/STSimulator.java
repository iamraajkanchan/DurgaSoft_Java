package multiThreading.packt.syncUtility.synchronizingTasks;

import java.util.concurrent.CyclicBarrier;

/**
 * Synchronizing tasks in a common point
 */
public class STSimulator {
    public static void main(String... args) {
        final int ROWS = 10000;
        final int NUMBERS = 10000;
        final int SEARCH = 5;
        final int PARTICIPANTS = 5;
        final int LINES_PARTICIPANTS = 2000;
        final STMatrixMock mock = new STMatrixMock(ROWS, NUMBERS, SEARCH);
        final STResults results = new STResults(ROWS);
        final STGrouper grouper = new STGrouper(results);
        final CyclicBarrier barrier = new CyclicBarrier(PARTICIPANTS, grouper);
        final STSearcher[] searchers = new STSearcher[PARTICIPANTS];
        for (int i = 0; i < PARTICIPANTS; i++) {
            searchers[i] = new STSearcher(i * LINES_PARTICIPANTS, (i * LINES_PARTICIPANTS) + LINES_PARTICIPANTS, mock, results, 5, barrier);
            final Thread thread = new Thread(searchers[i]);
            thread.start();
        }
        System.out.println("STSimulator: The main thread has finished");
    }
}
