package ru.mikhail.app.easy;
/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * Example:
 * Input: 38
 * Output: 2
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 *              Since 2 has only one digit, return it.
 */
public class Add_Digits_258 {
    public int addDigits(int num) {
        String helper = Integer.toString(num);
        int result;
        while (num / 10 != 0) {
            result = 0;
            for (int i = 0; i < helper.length(); i++) {
                result = Integer.parseInt(String.valueOf(helper.charAt(i))) + result;
            }
            num = result;
            helper = Integer.toString(num);
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 38;
        Add_Digits_258 function = new Add_Digits_258();
        System.out.println(function.addDigits(num));

    }
}
