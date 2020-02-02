package ru.mikhail.app;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 * Input: "race a car"
 * Output: false
 */

public class Valid_Palindrome_125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right) {
                if ((s.charAt(left) >= 'a' && s.charAt(left) <= 'z') || (s.charAt(left) >= '0' && s.charAt(left) <= '9')) {
                    if ((s.charAt(right) >= 'a' && s.charAt(right) <= 'z') || (s.charAt(right) >= '0' && s.charAt(right) <= '9')) {
                        if (s.charAt(left) != s.charAt(right)) {
                            return false;
                        } else {
                            right--;
                            left++;
                        }
                    } else {
                        right--;
                    }
                } else {
                    left++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        //String s = "race a car";
        String s = "a.";
        Valid_Palindrome_125 function = new Valid_Palindrome_125();
        System.out.println(function.isPalindrome(s));
    }
}
