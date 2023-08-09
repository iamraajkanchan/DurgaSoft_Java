package multiThreading.packt.syncUtility.synchronizingTasks;

/**
 * Synchronizing tasks in a common point
 * */
public class STResults {
    private final int[] data;

    public STResults(int size) {
        data = new int[size];
    }

    public void setData(int position, int value) {
        data[position] = value;
    }

    public int[] getData() {
        return data;
    }
}
