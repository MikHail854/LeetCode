package ru.mikhail.app.easy;

/**
 * Given an array nums, write a function to move all 0's to the end
 * of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Note:
 * 1) You must do this in-place without making a copy of the array.
 * 2) Minimize the total number of operations.
 */
public class Move_Zeroes_283 {
    public void moveZeroes(int[] nums) {
        /**
         * Runtime: 967 ms, faster than 5.07% of Java online submissions for Move Zeroes.
         * Memory Usage: 41.6 MB, less than 12.42% of Java online submissions for Move Zeroes.
         *
         *
         * It works correctly, but for a long time.
         */
        /*int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                p++;
        }
        while (p > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    for (int j = i; j < nums.length; j++) {
                        if (j == nums.length - 1)
                            nums[j] = 0;
                        else
                            nums[j] = nums[j + 1];
                    }
                }
            }
            p--;
        }*/

        /**
         * Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
         * Memory Usage: 42.1 MB, less than 9.07% of Java online submissions for Move Zeroes.
         */
        int helper = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[helper] = nums[i];
                helper++;
            }
        }
        for (int i = helper; i < nums.length; i++){
            nums[i] = 0;
        }
        /*for (int j = nums.length - 1; 0 <= j - helper; j--){
            nums[j] = 0;
        }*/
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        //int[] nums = {0, 0, 1};
        Move_Zeroes_283 function = new Move_Zeroes_283();
        function.moveZeroes(nums);
        for (int element : nums) {
            System.out.println(element);
        }
    }
}
