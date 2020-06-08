package ru.mikhail.app.easy;

public class House_Robber_198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 1};
        //int[] nums = {2, 7, 9, 3, 1};
        //int[] nums = {2, 1, 1, 2};
        //int[] nums = {1, 1, 1, 1};
        int[] nums = {6, 3, 10, 8, 2, 10, 3, 5, 10, 5, 3};
        House_Robber_198 function = new House_Robber_198();
        System.out.println(function.rob(nums));
    }
}
