package Leetcode;

public class PalindromePhrase {
    public static boolean isPalindrome(String s) {

        String modifiedStr = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = modifiedStr.length();

        for (int i = 0; i < n / 2; i++) {

            if (modifiedStr.charAt(i) != modifiedStr.charAt(n - i - 1)) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        Boolean result = isPalindrome(s);

        System.out.println("The String is palindrome " + result);

    }
}
