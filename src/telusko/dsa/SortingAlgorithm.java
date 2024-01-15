package telusko.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 6 5 2 8 9 4
public class SortingAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
        bubbleSort(numbers);
    }

    public static void bubbleSort(int[] numbers) {
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
