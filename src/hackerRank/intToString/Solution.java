package hackerRank.intToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int integerInput = Integer.parseInt(reader.readLine().trim());
            Object result = String.valueOf(integerInput);
            if (result instanceof String) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
