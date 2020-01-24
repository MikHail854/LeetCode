package ru.mikhail.app;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.

 * Example 2:
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 *
 * Note: Your solution should be in logarithmic time complexity.
 */
public class Factorial_Trailing_Zeroes_172 {
    public int trailingZeroes(int n) {
        /*if (n == 0){
            return 0;
        }
        int helper = 1;
        int result = 0;
        for (int i = 1; i <= n; i++){
            helper *= i;
        }
        return helper;
        while (helper / 10 > 0){
            if (helper % 10 == 0) {
                result++;
            } //else return result;
            helper /=10;
        }
        return result;*/


        int result = 0;
        //10=2 * 5
        //the number of 5 < the number of 2
        //so we just need get how many "5"
        while (n > 0) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 7;
        Factorial_Trailing_Zeroes_172 function = new Factorial_Trailing_Zeroes_172();
        System.out.println(function.trailingZeroes(n));
    }
}
