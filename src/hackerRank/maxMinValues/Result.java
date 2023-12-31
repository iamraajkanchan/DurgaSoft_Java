package hackerRank.maxMinValues;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static void miniMaxSum(List<Integer> arr) {
        List<Long> calculations = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            long newCalculation = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    newCalculation += arr.get(j);
                }
            }
            calculations.add(newCalculation);
        }
        long maxValue = calculations.stream().max(Long::compareTo).orElse(0L);
        long minValue = calculations.stream().min(Long::compareTo).orElse(0L);
        System.out.printf("%d %d", minValue, maxValue);
    }
}
