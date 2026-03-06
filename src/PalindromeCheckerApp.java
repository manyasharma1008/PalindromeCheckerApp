import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return input.equals(reversed);
    }

    public static boolean dequePalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static boolean recursivePalindrome(String input, int start, int end) {
        if (start >= end)
            return true;
        if (input.charAt(start) != input.charAt(end))
            return false;
        return recursivePalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome performance:");
        String input = scanner.nextLine();

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Stack method: " + stackResult + ", Time: " + stackTime + " ns");
        System.out.println("Deque method: " + dequeResult + ", Time: " + dequeTime + " ns");
        System.out.println("Recursive method: " + recursiveResult + ", Time: " + recursiveTime + " ns");

        scanner.close();
    }
}