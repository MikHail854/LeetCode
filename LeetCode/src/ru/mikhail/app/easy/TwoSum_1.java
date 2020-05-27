package ru.mikhail.app.easy;

public class TwoSum_1 {
    public static class Sum {

        public static int[] TwoSum(int[] nums, int target) {
            for (int i = 0; i <= nums.length; i++) {
                for (int j = i + 1; j <= nums.length - 1; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }

        public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] result = new int[2];
            result = Sum.TwoSum(nums, target);
            System.out.println("Result = " + result[0] + ", " + result[1]);
        }
    }
}
