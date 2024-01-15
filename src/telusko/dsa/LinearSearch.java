package telusko.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(reader.readLine().trim());
        int searchedIndex = search(numbers, target);
        if(searchedIndex >= 0) {
            System.out.println("Element found at index: " + searchedIndex + ".");
        } else {
            System.out.println("Sorry, Element didn't found in the numbers.");
        }
    }

    public static int search(int[] numbers, int target) {
        int n = numbers.length - 1;
        for (int i = 0; i <= n; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
