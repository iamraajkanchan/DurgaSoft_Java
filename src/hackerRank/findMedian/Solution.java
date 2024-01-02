package hackerRank.findMedian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine().trim());
        List<Integer> inputs = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).toList();
        int median = Result.findMedian(inputs);
        System.out.println(median);
    }
}
