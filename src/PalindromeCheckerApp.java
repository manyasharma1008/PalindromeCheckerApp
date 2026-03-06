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
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string to check palindrome:");
            String input = scanner.nextLine();

            Deque<Character> deque = new ArrayDeque<>();

            for (int i = 0; i < input.length(); i++) {
                deque.addLast(input.charAt(i));
            }

            boolean isPalindrome = true;

            while (deque.size() > 1) {
                char first = deque.removeFirst();
                char last = deque.removeLast();

                if (first != last) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("The string \"" + input + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
            }

            scanner.close();
        }
}

