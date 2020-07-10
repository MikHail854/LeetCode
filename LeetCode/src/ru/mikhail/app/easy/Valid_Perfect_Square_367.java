package ru.mikhail.app.easy;

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Follow up: Do not use any built-in library function such as sqrt.
 *
 *
 *
 * Example 1:
 * Input: num = 16
 * Output: true
 *
 * Example 2:
 * Input: num = 14
 * Output: false
 *
 *
 * Constraints:
 * 1 <= num <= 2^31 - 1
 */
public class Valid_Perfect_Square_367 {
    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long lo = 1;
        long  mid;
        long hi = num;

        while (lo < hi) {

            mid = (lo + hi) / 2;
            if (mid * mid == num)
                return true;
            else if (mid * mid > num)
                hi = mid;
            else if (mid * mid < num)
                lo = mid;

            if (hi - lo == 1)
                return false;

        }
        return false;
    }

    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }
}
