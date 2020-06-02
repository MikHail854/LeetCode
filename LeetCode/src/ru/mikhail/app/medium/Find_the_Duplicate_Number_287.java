package ru.mikhail.app.medium;

import java.util.Arrays;

/**
 * Given an array nums containing n + 1 integers where each
 * integer is between 1 and n (inclusive), prove that at least one
 * duplicate number must exist. Assume that there is only one duplicate number,
 * find the duplicate one.
 *
 * Example 1:
 * Input: [1,3,4,2,2]
 * Output: 2

 * Example 2:
 * Input: [3,1,3,4,2]
 * Output: 3

 * Note:
 * 1. You must not modify the array (assume the array is read only).
 * 2. You must use only constant, O(1) extra space.
 * 3. Your runtime complexity should be less than O(n2).
 * 4. There is only one duplicate number in the array, but it could be repeated more than once.
 */

public class Find_the_Duplicate_Number_287 {
    public int findDuplicate(int[] nums) {
        /*Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]){
                return nums[i];
            }
        }
        return -1;*/

        int k = 0;
        int helper = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                helper++;
                if (helper > 1) {
                    return k;
                }
            }
            if (i == nums.length - 1) {
                i = -1;
                k++;
                helper = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] nums = {1, 3, 4, 2, 2};
        int[] nums = {3, 1, 3, 4, 2};
        Find_the_Duplicate_Number_287 function = new Find_the_Duplicate_Number_287();
        System.out.println(function.findDuplicate(nums));
    }
}
