package leetcode.twoSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(reader.readLine().trim());
        int[] numbers = Arrays.stream(reader.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> numbers = Arrays.stream(nums).boxed().toList();
        int[] indexPair = new int[2];
        Optional<Integer> temp = numbers.stream().reduce((a, b) -> {
            if (a + b == target) {
                indexPair[0] = numbers.indexOf(a);
                indexPair[1] = numbers.indexOf(b);
            }
            return a + b;
        });
        System.out.println("twoSum :: temp : " + temp);
        /*
        int numberSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                numberSum += nums[i];
                if (numberSum == target) {
                    indexPair[1] = i;
                }
            }
        }
        */
        return indexPair;
    }
}
