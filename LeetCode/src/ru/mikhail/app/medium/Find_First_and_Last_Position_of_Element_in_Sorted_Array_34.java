package ru.mikhail.app.medium;

import java.util.ArrayList;

/**
 * Given an array of integers nums sorted in ascending order,
 * find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 *  Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        ArrayList<Integer> numsList = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                numsList.add(i);
        }
        if (numsList.size() == 1)
            numsList.add(numsList.get(0));
        if (!numsList.isEmpty()) {
            result[0] = numsList.get(0);
            result[1] = numsList.get(numsList.size() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        //int[] nums = {5, 7, 7, 8, 8, 10};
        //int target = 8;
        int[] nums = {3, 3, 3};
        int target = 3;
        Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 function =
                new Find_First_and_Last_Position_of_Element_in_Sorted_Array_34();
        for (int num : function.searchRange(nums, target)) {
            System.out.println(num);

        }
    }
}
