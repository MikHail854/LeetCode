package ru.mikhail.app.easy;

/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 * Input: 1
 * Output: true
 * Explanation: 2^0 = 1
 *
 * Example 2:
 * Input: 16
 * Output: true
 * Explanation: 2^4 = 16
 *
 * Example 3:
 * Input: 218
 * Output: false
 */
public class Power_of_Two_231 {
    public boolean isPowerOfTwo(int n) {
        int input = n;
        if (n == 1) {
            return true;
        }
        if (n == 0 || n < 0) {
            return false;
        }
        int helper = 0;
        while (n % 2 == 0) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
            helper++;
        }
        int result = 1;
        for (int i = 0; i < helper; i++) {
            result = result * 2;
        }
        if (result == input) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int input = 256;
        Power_of_Two_231 function = new Power_of_Two_231();
        System.out.println(function.isPowerOfTwo(input));
    }
}
