package ru.mikhail.app.easy;

/**
 * The set S originally contains numbers from 1 to n.
 * But unfortunately, due to the data error, one of the numbers
 * in the set got duplicated to another number in the set,
 * which results in repetition of one number and loss of another number.
 *
 * Given an array nums representing the data status of this set after the error.
 * Your task is to firstly find the number occurs twice and then find the number that is missing.
 * Return them in the form of an array.
 *
 * Example 1:
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 *
 * Note:
 * The given array size will in the range [2, 10000].
 * The given array's numbers won't have any order.
 */
public class Set_Mismatch_645 {
    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0)
                dup = Math.abs(nums[i]);
            else
                nums[Math.abs(nums[i]) - 1] *= -1;

            sum += i + 1 - Math.abs(nums[i]);
        }
        return new int[]{dup, dup + sum};
    }

    public static void main(String[] args) {
        //int[] nums = {1, 2, 2, 4};
        //int[] nums = {2, 2};
        //int[] nums = {1, 1};
        int[] nums = {3, 2, 3, 4, 6, 5};
        Set_Mismatch_645 function = new Set_Mismatch_645();
        function.findErrorNums(nums);
        for (Integer number : function.findErrorNums(nums)) {
            System.out.println(number);
        }
    }
}