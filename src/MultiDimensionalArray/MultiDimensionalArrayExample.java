package MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayExample {
    public static void main(String[] a) {
        int[][] horizontalElements = {{1, 5, 7, 9, 10, 11}, {6, 10, 12, 13, 20, 21}, {9, 25, 29, 30, 32, 41}, {15, 55, 59, 63, 68, 70}, {40, 70, 79, 81, 95, 105}};
        for (int[] horizontalElement : horizontalElements) {
            System.out.println(Arrays.toString(horizontalElement));
        }
    }
}
