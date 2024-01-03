package hackerRank.staticBlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int breadth = Integer.parseInt(reader.readLine().trim());
            int height = Integer.parseInt(reader.readLine().trim());
            if (breadth > 0 && height > 0) {
                long area = (long) breadth * height;
                System.out.println(area);
            } else {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
