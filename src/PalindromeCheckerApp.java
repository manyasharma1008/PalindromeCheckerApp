/*
Use Case 1: Palindrome Checker App
Author: Manya Sharma
Date: 12-02-2025
Reg. No.: RA2411026010261
*/

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String check = "Madam".toLowerCase();

        int i = 0;
        int j = check.length() - 1;
        boolean isPalindrome = true;

        while(i < j) {
            if(check.charAt(i) != check.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
