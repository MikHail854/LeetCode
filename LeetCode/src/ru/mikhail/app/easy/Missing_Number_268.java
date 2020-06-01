package ru.mikhail.app.easy;

import java.util.Arrays;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 * Input: [3,0,1]
 * Output: 2

 * Example 2:
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 */

public class Missing_Number_268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
            if (i == nums.length - 1) {
                return ++i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] nums = {3, 0, 1};
        int[] nums = {0};
        Missing_Number_268 function = new Missing_Number_268();
        System.out.println(function.missingNumber(nums));
    }
}
