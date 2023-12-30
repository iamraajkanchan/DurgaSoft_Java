package hackerRank.stdInOut;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String firstInput = scanner.nextLine();
            int myInt = Integer.parseInt(firstInput);
            String secondInput = scanner.nextLine();
            double myDouble = Double.parseDouble(secondInput);
            String myString = scanner.nextLine();
            System.out.println("String: " + myString);
            System.out.println("Double: " + myDouble);
            System.out.println("Int: " + myInt);
        } catch (NumberFormatException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
