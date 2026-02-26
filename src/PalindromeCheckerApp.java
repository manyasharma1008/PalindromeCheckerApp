/*
Use Case 1: Palindrome Checker App
Author: Manya Sharma
Date: 12-02-2025
Reg. No.: RA2411026010261
*/
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char[] chars = input.toCharArray();

            int start = 0;
            int end = chars.length - 1;
            boolean isPalindrome = true;

            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is NOT a palindrome.");
            }
            scanner.close();
        }
}
