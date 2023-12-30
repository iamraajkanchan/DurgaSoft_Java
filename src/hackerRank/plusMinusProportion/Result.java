package hackerRank.plusMinusProportion;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int number : arr) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        double positiveRatio = (double) positiveCount / arr.size();
        double negativeRatio = (double) negativeCount / arr.size();
        double zeroRatio = (double) zeroCount / arr.size();
        DecimalFormat numberFormat = new DecimalFormat("0.000000");
        System.out.println(numberFormat.format(positiveRatio));
        System.out.println(numberFormat.format(negativeRatio));
        System.out.println(numberFormat.format(zeroRatio));
    }

}