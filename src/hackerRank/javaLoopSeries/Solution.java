package hackerRank.javaLoopSeries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int query = Integer.parseInt(reader.readLine().trim());
        String[] separatedQuery = new String[query];
        for (int i = 0; i < query; i++) {
            separatedQuery[i] = Arrays.toString(reader.readLine().trim().split("\\s"));
        }
        for (int i = 0; i < query; i++) {
            StringBuilder builder = getStringBuilder(separatedQuery[i]);
            System.out.println(builder);
        }
    }

    private static StringBuilder getStringBuilder(String separatedQuery) {
        String replacedQuery = separatedQuery.replaceFirst("\\[", "").replaceFirst("]", "").replaceAll(",", "");
        int startingValue = Integer.parseInt(replacedQuery.split("\\s")[0]);
        int sequenceValue = Integer.parseInt(replacedQuery.split("\\s")[1]);
        int limitingValue = Integer.parseInt(replacedQuery.split("\\s")[2]);
        StringBuilder builder = new StringBuilder();
        for (int j = 1; j <= limitingValue; j++) {
            int previousCalculation = 0;
            for (int k = 1; k <= limitingValue; k++) {
                int result = startingValue + previousCalculation + k * sequenceValue;
                previousCalculation = result;
                builder.append(result);
                builder.append(" ");
            }
        }
        return builder;
    }
}
