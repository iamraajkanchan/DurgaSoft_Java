package gfg.arrayPairSum;

import java.util.HashMap;

public class Result {
    public static boolean canPair(int[] numbers, int k) {
        HashMap<Integer, Integer> remainderCount = new HashMap<>();


        for (int num : numbers) {
            int remainder = num % k;
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        if (k % 2 == 0 && remainderCount.getOrDefault(k / 2, 0) % 2 != 0) {
            return false;
        }
        if (remainderCount.getOrDefault(0, 0) % 2 != 0) {
            return false;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (remainderCount.getOrDefault(i, 0) != remainderCount.getOrDefault(k - i, 0)) {
                return false;
            }
        }

        return true;
    }
}
