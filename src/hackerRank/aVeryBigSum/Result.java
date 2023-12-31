package hackerRank.aVeryBigSum;

import java.util.List;
import java.util.Optional;

public class Result {
    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        Optional<Long> integration = ar.stream().reduce((a, b) -> (long) a + b);
        return integration.orElse(0L);
    }
}
