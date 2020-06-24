package ru.mikhail.app.easy;

/**
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Example 1:
 * Input: 27
 * Output: true
 *
 * Example 2:
 * Input: 0
 * Output: false
 *
 * Example 3:
 * Input: 9
 * Output: true
 *
 * Example 4:
 * Input: 45
 * Output: false
 *
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class Power_of_Three_326 {
    public boolean isPowerOfThree(int n) {
        if (n == 1 || n == 3)
            return true;
        while (n >= 3) {
            if (n % 3 == 0) {
                n = n / 3;
                if (n == 3)
                    return true;
            } else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Power_of_Three_326 function = new Power_of_Three_326();
        int n = 3;
        System.out.println(function.isPowerOfThree(n));
    }
}
