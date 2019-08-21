package ru.mikhail.app;

/**
 * Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121.
 * From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 *
 * Coud you solve it without converting the integer to a string?
 */
public class Palindrome_Number_9 {
    public boolean isPalindrome(int x) {
        int comparison = x;
        if (x < 0){
            return false;
        }
        int a = Math.abs(x);
        int count = (a == 0) ? 1 : 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        int output = 0;
        int increment = 1;
        int helper;
        for (int i = 0; i < count - 1; i++) {
            increment *= 10;
        }
        for (int i = 0; i < count; i++) {
            helper = x % 10;
            x = x / 10;
            output = output + helper * increment;
            increment /= 10;
        }
        if (output == comparison) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int x = 121;
        boolean exit;
        Palindrome_Number_9 result = new Palindrome_Number_9();
        exit = result.isPalindrome(x);
        System.out.println(exit);

    }

}

