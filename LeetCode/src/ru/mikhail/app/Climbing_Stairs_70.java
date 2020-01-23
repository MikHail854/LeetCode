package ru.mikhail.app;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class Climbing_Stairs_70 {
    public int climbStairs(int n) {
        int result = 0;
        if (n<=2){
            return n;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int input = 5;
        Climbing_Stairs_70 function = new Climbing_Stairs_70();
        System.out.println(function.climbStairs(input));
    }
}