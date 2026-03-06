import java.util.Scanner;

class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        boolean result = checker.checkPalindrome(input);
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
        scanner.close();
    }
}
