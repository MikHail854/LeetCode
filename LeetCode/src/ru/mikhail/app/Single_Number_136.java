package ru.mikhail.app;

import java.util.Arrays;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class Single_Number_136 {
    public int singleNumber (int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 1; i = i + 2){
            if (i == nums.length-1){
                return nums[i];
            }else if (nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        //int[] nums = {4,1,2,1,2};
        Single_Number_136 function = new Single_Number_136();
        System.out.println(function.singleNumber(nums));
    }
}
