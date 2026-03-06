/*
Use Case 1: Palindrome Checker App
Author: Manya Sharma
Date: 12-02-2025
Reg. No.: RA2411026010261
*/
import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string to check palindrome:");
            String input = scanner.nextLine();

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            String reversed = "";
            while (!stack.isEmpty()) {
                reversed = reversed + stack.pop();
            }

            if (input.equals(reversed)) {
                System.out.println("The string \"" + input + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
            }

            scanner.close();
        }
}

