package multiThreading.packt.syncUtility.synchronizingTasks;

import java.util.concurrent.CyclicBarrier;

/**
 * Synchronizing tasks in a common point
 * */
public class STSearcher implements Runnable {
    private final int firstRow;
    private final int lastRow;
    private final STMatrixMock mock;
    private final STResults results;
    private final int number;
    private final CyclicBarrier barrier;

    public STSearcher(int firstRow, int lastRow, STMatrixMock mock, STResults results, int number, CyclicBarrier barrier) {
        this.firstRow = firstRow;
        this.lastRow = lastRow;
        this.mock = mock;
        this.results = results;
        this.number = number;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        int counter;
        System.out.printf("%s: Processing lines from %d to %d\n", Thread.currentThread().getName(), firstRow, lastRow);
        for (int i = firstRow; i < lastRow; i++) {
            final int[] row = mock.getRow(i);
            counter = 0;
            for (int j = 0; j < row.length; i++) {
                if (row[j] == number) {
                    counter++;
                }
            }
        }
    }

    // Continue from page 100
}
