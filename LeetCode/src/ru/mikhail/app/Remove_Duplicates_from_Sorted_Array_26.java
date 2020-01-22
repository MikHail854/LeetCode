package ru.mikhail.app;

public class Remove_Duplicates_from_Sorted_Array_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return nums.length;
        }
        int helper;
        int result = 0;
        int length_Input_Array = nums.length;
        int k = 2;
        int k2 = nums.length * 2;
//            while (k > 0) {
//                for (int i = 0; i < length_Input_Array - 1; i++) {
//                    if (nums[i] == nums[i + 1] || nums[i] > nums[i+1]) {
//                        helper = nums[i];
//                        nums[i] = nums[length_Input_Array - 1];
//                        nums[length_Input_Array - 1] = helper;
//                        result++;
//                        length_Input_Array--;
//                    }
//                }
//                k--;
//            }
//            while (k2 > 0) {
//                for (int j = 0; j < nums.length - result - 1; j++) {
//                    if (nums[j] > nums[j + 1]) {
//                        helper = nums[j];
//                        nums[j] = nums[j + 1];
//                        nums[j + 1] = helper;
//                    }
//                }
//
//                k2--;
//            }
//        return nums.length - result;

        //int result = 0;
        //int helper;
        //int length = nums.length;
       /* while (k > 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < length_Input_Array ; j++) {
                    if (nums[i] == nums[j]) {
                        helper = nums[j];
                        nums[j] = nums[length_Input_Array - 1];
                        nums[length_Input_Array - 1] = helper;
                        length_Input_Array--;
                        result++;
                    }
                }
            }
            k--;

        }
        if (nums[nums.length/2-1] == nums[nums.length/2]){
            result++;
        }
        while (k2 > 0) {
            for (int j = 0; j < nums.length - result - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    helper = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = helper;
                }
            }
            k2--;
        }

        return nums.length - result;*/
        if (nums.length == 0) {
            return nums.length;
        }
        int n = nums.length;
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        //int[] nums = {1, 2, 2};
        //int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //int[] nums = {0, 0, 0, 0, 0, 1, 2, 2, 3, 3, 4, 4};
        //int[] nums = {1, 1, 2, 2};
        //int[] nums = {-50, -50, -49, -49, -47, -47, -47, -46, -46, -45, -41, -41, -41, -38, -38, -37, -36, -36, -33, -32, -32, -31, -31, -30, -29, -29, -28, -27, -27, -25, -24, -23, -23, -21, -21, -21, -20, -20, -19, -19, -16, -16, -16, -16, -15, -13, -13, -12, -12, -11, -11, -11, -9, -9, -9, -9, -8, -7, -6, -5, -3, -2, -1, -1, 0, 0, 0, 0, 3, 3, 4, 4, 6, 6, 6, 8, 9, 12, 13, 13, 14, 15, 16, 16, 16, 16, 17, 18, 20, 20, 20, 21, 21, 21, 23, 23, 25, 25, 30, 31, 31, 32, 33, 34, 34, 35, 35, 36, 36, 36, 37, 38, 39, 42, 42, 43, 44, 45, 45, 45, 46, 47, 48, 50};
        Remove_Duplicates_from_Sorted_Array_26 function = new Remove_Duplicates_from_Sorted_Array_26();
        System.out.println(function.removeDuplicates(nums));
    }
}
