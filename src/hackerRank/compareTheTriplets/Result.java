package hackerRank.compareTheTriplets;

import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            }
            if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        return Arrays.asList(aliceScore, bobScore);
    }

}
