package hackerRank.findMedian;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static int findMedian(List<Integer> arr) {
        List<Integer> mutableList = new ArrayList<>(arr);
        mutableList.sort(Integer::compare);
        int medianIndex;
        if (mutableList.size() % 2 == 0) {
            medianIndex = mutableList.size() / 2;
        } else {
            medianIndex = (mutableList.size() / 2) + 1;
        }
        return mutableList.get(medianIndex - 1);
    }
}
