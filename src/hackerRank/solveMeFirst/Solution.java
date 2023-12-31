package hackerRank.solveMeFirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        secondMethod();
    }

    public static void firstMethod() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInput = reader.readLine().trim().split(" = ");
        String[] secondInput = reader.readLine().trim().split(" = ");
        int numberFromFirstInput = Integer.parseInt(firstInput[1]);
        int numberFromSecondInput = Integer.parseInt(secondInput[1]);
        System.out.println(numberFromFirstInput + numberFromSecondInput);
    }

    public static void secondMethod() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstInput = Integer.parseInt(reader.readLine().trim());
        int secondInput = Integer.parseInt(reader.readLine().trim());
        System.out.println(firstInput + secondInput);
    }
}
