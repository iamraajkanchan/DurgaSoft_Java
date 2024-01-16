package telusko.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 6 5 2 8 9 4
// 38	55	55	97	89	45	39	14	28	82	47	63	13	56	90	63	15	16	17	63	54	44	96	27	91	73	70	60	49	41	39	82	59	67	15	62	70	48	99	36	34	45	89	23	91	2	83	1	39	87	80	72	62	69	36	29	31	61	12	14	43	38	50	66	51	51	38	69	55	0	48	51	40	79	53	47	99	69	71	2	66	82	88	31	8	39	43	24	66	92	21	37	18	46	43	62	88	87	20
public class SortingAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
        // sortNumbers(numbers, SortingAlgorithm::bubbleSort);
        // sortNumbers(numbers, SortingAlgorithm::selectionSort);
        // sortNumbers(numbers, SortingAlgorithm::insertionSort);
        quickSort(numbers, 0, numbers.length - 1);
        printArray("Quick Sort", numbers);
    }

    private static void bubbleSort(int[] numbers) {
        int temp = 0;
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        printArray("Bubble Sort", numbers);
    }

    private static void selectionSort(int[] numbers) {
        int temp = 0;
        int minIndex = -1;
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (numbers[minIndex] > numbers[j]) {
                    minIndex = j;
                }
            }
            temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        printArray("Selection Sort", numbers);
    }

    private static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
        printArray("Insertion Sort", numbers);
    }

    private static void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int pi = partition(numbers, low, high);
            quickSort(numbers, low, pi - 1);
            quickSort(numbers, pi + 1, high);
        }
    }

    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (numbers[j] < pivot) {
                i++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;
        return i + 1;
    }

    private static void sortNumbers(int[] numbers, SortingTask task) {
        Thread thread = new Thread(() -> task.runTask(numbers));
        thread.start();
    }

    private static void printArray(String sortMethod, int[] numbers) {
        System.out.println(sortMethod);
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int j = 0; j < numbers.length; j++) {
            builder.append(numbers[j]);
            if (j != numbers.length - 1) {
                builder.append(",");
            }
        }
        builder.append("]");
        System.out.println(builder);
    }
}
