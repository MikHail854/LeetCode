package ru.mikhail.app.easy;

import java.util.Arrays;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than [n/2] times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */

public class Majority_Element_169 {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                result++;
                if (result > nums.length / 2) {
                    return nums[i];
                }
            } else {
                result = 1;
            }
        }
        return 0;
    }

    /*public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int increment = 1;
        for (int i = 0; i < nums.length; i++) {
            increment = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    increment++;
                }
                if (increment > nums.length / 2) {
                    return nums[i];
                }
            }

        }
        return 0;
    }*/

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        //int[] nums = {2,2,1,1,1,2,2};
        Majority_Element_169 function = new Majority_Element_169();
        System.out.println(function.majorityElement(nums));
    }
}
