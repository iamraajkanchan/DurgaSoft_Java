package gfg.reverseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine().trim();
        System.out.println(reverseWord(inputString));
    }

    public static String reverseWordFromStringBuilder(String inputString) {
        StringBuilder builder = new StringBuilder(inputString);
        return builder.reverse().toString();
    }

    public static String reverseWord(String inputString) {
        char[] inputStringInArray = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            inputStringInArray[i] = inputString.charAt(i);
        }
        String result = "";
        for (int j = inputStringInArray.length - 1; j >= 0; j--) {
            result += inputStringInArray[j];
        }
        return result;
    }

}
