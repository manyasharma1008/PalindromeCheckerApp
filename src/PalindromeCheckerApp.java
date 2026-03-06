import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    interface PalindromeStrategy {
        boolean check(String input);
    }

    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String input) {
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
    }

    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String input) {
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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        System.out.println("Choose strategy: 1 = Stack, 2 = Deque");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        PalindromeStrategy strategy;
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        if (strategy.check(input)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}