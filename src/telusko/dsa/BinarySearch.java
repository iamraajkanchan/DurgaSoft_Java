package telusko.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
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
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == numbers[mid]) {
                return mid;
            } else if (target > numbers[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
