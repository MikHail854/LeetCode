package ru.mikhail.app.easy;

/**
 * Write an algorithm to determine if a number n is "happy".
 *
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 *
 * Return True if n is a happy number, and False if not.
 *
 * Example:
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */
public class Happy_Number_202 {
    public boolean isHappy(int n) {
        int helper = 0;
        int n_under;
        int iter = 0;
        while (n > 0) {
            while (n > 0) {
                n_under = n % 10;
                helper += (int) Math.pow(n_under, 2);
                n = (n - n_under) / 10;
            }
            if (helper == 1) {
                return true;
            } else {
                n = helper;
                helper = 0;
            }
            iter++;
            if (iter == 10) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 19;
        Happy_Number_202 function = new Happy_Number_202();
        System.out.println(function.isHappy(n));
    }
}
