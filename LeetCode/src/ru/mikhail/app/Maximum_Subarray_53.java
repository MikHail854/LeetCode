package ru.mikhail.app;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class Maximum_Subarray_53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int actual = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            actual = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                actual = actual + nums[j];
                if (actual > max) {
                    max = actual;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        //int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {-2, -1};
        //int[] nums = {-2, 1};
        Maximum_Subarray_53 function = new Maximum_Subarray_53();
        System.out.println(function.maxSubArray(nums));
    }
}
