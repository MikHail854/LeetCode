package ru.mikhail.app.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 */
public class Reverse_Integer_7 {

    public int reverse(int x) {
        int a = Math.abs(x);
        int count = (a == 0) ? 1 : 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        int output = 0;
        long overflow = 0;
        int increment = 1;
        long increment2 = 1;
        int helper;
        for (int i = 0; i < count - 1; i++){
            increment *=10;
            increment2 *=10;
        }
        for (int i = 0; i < count; i++) {
            if (x < Math.pow(-2, 31) || x > Math.pow(2, 31) - 1) {
                return 0;
            } else {
                helper = x % 10;
                x = x / 10;
                output = output + helper * increment;
                overflow = overflow + helper * increment2;
                increment /= 10;
                increment2 /=10;
                if (overflow < -2147483648 || overflow > 2147483647) {
                    return 0;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int x = -2147483412;
        int exit;
        Reverse_Integer_7 result = new Reverse_Integer_7();
        exit = result.reverse(x);
        System.out.println(exit);
    }
}
