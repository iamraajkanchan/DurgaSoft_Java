package telusko.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SearchAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(reader.readLine().trim());
        int linearSearchResult = linearSearch(numbers, target);
        if (linearSearchResult >= 0) {
            System.out.println("Element found at index: " + linearSearchResult + ".");
        } else {
            System.out.println("Sorry, Element didn't found in the numbers.");
        }
        int binarySearchResult = binarySearch(numbers, target);
        if (binarySearchResult >= 0) {
            System.out.println("Element found at index: " + binarySearchResult + ".");
        } else {
            System.out.println("Sorry, Element didn't found in the numbers.");
        }
        int binarySearchWithRecursive = binarySearchWithRecursive(numbers, target, 0, numbers.length - 1);
        if (binarySearchWithRecursive >= 0) {
            System.out.println("Element found at index: " + binarySearchWithRecursive + ".");
        } else {
            System.out.println("Sorry, Element didn't found in the numbers.");
        }
    }

    public static int linearSearch(int[] numbers, int target) {
        int step = 0;
        int n = numbers.length - 1;
        for (int i = 0; i <= n; i++) {
            step++;
            if (numbers[i] == target) {
                System.out.println("Steps taken by Linear Search : " + step);
                return i;
            }
        }
        System.out.println("Steps taken by Linear Search : " + step);
        return -1;
    }

    public static int binarySearch(int[] numbers, int target) {
        int step = 0;
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            step++;
            int mid = (left + right) / 2;
            if (target == numbers[mid]) {
                System.out.println("Steps taken by Binary Search : " + step);
                return mid;
            } else if (target > numbers[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by Binary Search : " + step);
        return -1;
    }

    public static int binarySearchWithRecursive(int[] numbers, int target, int left, int right) {
        int step = 0;
        if (left <= right) {
            step++;
            int mid = (left + right) / 2;
            if (target == numbers[mid]) {
                System.out.println("Steps taken by Binary Search With Recursive : " + step);
                return mid;
            } else if (target > numbers[mid]) {
                return binarySearchWithRecursive(numbers, target, mid + 1, right);
            } else {
                return binarySearchWithRecursive(numbers, target, left, mid - 1);
            }
        }
        System.out.println("Steps taken by Binary Search With Recursive : " + step);
        return -1;
    }
}
