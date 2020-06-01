package ru.mikhail.app.hard;

import java.util.Arrays;

/**
 * Given an unsorted integer array, find the smallest missing positive integer.
 *
 * Example 1:
 * Input: [1,2,0]
 * Output: 3

 * Example 2:
 * Input: [3,4,-1,1]
 * Output: 2

 * Example 3:
 * Input: [7,8,9,11,12]
 * Output: 1
 */
public class First_Missing_Positive_41 {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        Arrays.sort(nums);
        boolean fl = false;
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                fl = true;
            }
            if (i == nums.length - 1) {
                if (fl == false) {
                    return k;
                } else {
                    i = -1;
                    k++;
                    fl = false;
                }
            }
        }
        return nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
        //int[] nums = {0, 1, 2, 3};
        //int[] nums = {1, 2, 0};
        int[] nums = {3, 4, -1, 1};
        //int[] nums = {7, 8, 9, 11, 12};
        //int[] nums = {1};
        //int[] nums = {2};
        //int[] nums = {-5};
        First_Missing_Positive_41 function = new First_Missing_Positive_41();
        System.out.println(function.firstMissingPositive(nums));
    }
}
