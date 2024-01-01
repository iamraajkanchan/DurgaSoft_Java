package gfg.arrayPairSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine().trim());
        String[] inputString = reader.readLine().trim().split(" ");
        int[] numbers = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
        System.out.println(Result.canPair(numbers, k));
    }
}
