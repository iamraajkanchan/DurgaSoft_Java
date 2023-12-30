package hackerRank.javaOutputFormatting;

import java.util.Scanner;

/**
 *
 * Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

 * To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

 * Input Format

 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

 * Output Format

 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly  characters.
 * The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

 Sample Input

 java 100
 cpp 65
 python 50

 Sample Output

 ================================
 java           100
 cpp            065
 python         050
 ================================

 Problem URL
 https://www.hackerrank.com/challenges/java-output-formatting/problem

 * */

public class Solution {
    public static void main(String[] args) {
        firstSolution();
    }
    public static void firstSolution() {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String[] separatedFirstInput = firstInput.split("\s");
        String stringFromFirstInput = separatedFirstInput[0];
        int integerFromFirstInput = Integer.parseInt(separatedFirstInput[1]);
        String secondInput = scanner.nextLine();
        String[] separatedSecondInput = secondInput.split("\s");
        String stringFromSecondInput = separatedSecondInput[0];
        int integerFromSecondInput = Integer.parseInt(separatedSecondInput[1]);
        String thirdInput = scanner.nextLine();
        String[] separatedThirdInput = thirdInput.split("\s");
        String stringFromThirdInput = separatedThirdInput[0];
        int integerFromThirdInput = Integer.parseInt(separatedThirdInput[1]);
        System.out.println("================================");
        System.out.printf("%-15s%03d\n", stringFromFirstInput, integerFromFirstInput);
        System.out.printf("%-15s%03d\n", stringFromSecondInput, integerFromSecondInput);
        System.out.printf("%-15s%03d\n", stringFromThirdInput, integerFromThirdInput);
        System.out.println("================================");
    }
}
