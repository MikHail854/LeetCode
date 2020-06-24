package ru.mikhail.app.medium;

/**
 * Given a positive integer n, break it into the sum of at least two
 * positive integers and maximize the product of those integers.
 * Return the maximum product you can get.
 *
 * Example 1:
 * Input: 2
 * Output: 1
 * Explanation: 2 = 1 + 1, 1 × 1 = 1.
 *
 * Example 2:
 * Input: 10
 * Output: 36
 * Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
 *
 * Note: You may assume that n is not less than 2 and not larger than 58.
 */
public class Integer_Break_343 {
    public int integerBreak(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        if (n == 4)
            return 4;
        int res = 1;
        if (n % 3 == 1) {
            res = (int) Math.pow(3, n / 3 - 1);
            res *= 4;
        } else {
            res = (int) Math.pow(3, n / 3);
            if (n % 3 != 0)
                res *= n % 3;
        }
        return res;
    }

    public static void main(String[] args) {
        Integer_Break_343 function = new Integer_Break_343();
        int n = 2;
        System.out.println(function.integerBreak(n));
    }
}
