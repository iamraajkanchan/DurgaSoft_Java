package multiThreading.packt.syncUtility.synchronizingTasks;

import java.util.Random;

/**
 * Synchronizing tasks in a common point
 */
public class STMatrixMock {
    final private int[][] data;

    public STMatrixMock(int size, int length, int number) {
        int counter = 0;
        data = new int[size][length];
        final Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = random.nextInt();
                if (data[i][j] == number) {
                    counter++;
                }
            }
        }
        System.out.printf("STMatrixMock: There are %d occurrences of number in the generated data\n", counter);
    }

    public int[] getRow(int row) {
        if ((row >= 0) && (row < data.length)) {
            return data[row];
        }
        return null;
    }
}
