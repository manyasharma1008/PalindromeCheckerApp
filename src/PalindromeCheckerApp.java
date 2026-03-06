/*
Use Case 1: Palindrome Checker App
Author: Manya Sharma
Date: 12-02-2025
Reg. No.: RA2411026010261
*/
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
        public static boolean isPalindrome(String str, int start, int end) {
            if (start >= end)
                return true;

            if (str.charAt(start) != str.charAt(end))
                return false;

            return isPalindrome(str, start + 1, end - 1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string to check palindrome:");
            String input = scanner.nextLine();

            boolean result = isPalindrome(input, 0, input.length() - 1);

            if (result) {
                System.out.println("The string \"" + input + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
            }

            scanner.close();
        }
    }