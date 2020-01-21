package ru.mikhail.app;

public class Remove_Duplicates_from_Sorted_Array_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1){
            return nums.length;
        }
        int helper;
        int decrement = 1;
        int result = 0;
        int repeat = nums.length;
        int k = 2;
        int k2 = nums.length*2;
        while (k > 0) {
            for (int i = 0; i < repeat - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    helper = nums[i];
                    nums[i] = nums[nums.length - decrement];
                    nums[nums.length - decrement] = helper;
                    decrement++;
                    result++;
                    repeat--;
                }
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
            k--;
        }

        /*int result = 0;
        int helper;
        int length = nums.length;
        for (int i = 0; i < length-1; i++){
            for (int j = i +1; j < length-2; j++){
                if (nums[i] == nums[j]){
                    helper = nums[j];
                    nums[j] = nums[length-1];
                    nums[length-1] = helper;
                    length--;
                    result++;
                }
            }
        }
        for (int j = 0; j < nums.length-result-1; j++){
            if (nums[j] > nums[j+1]){
                helper = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = helper;
            }
        }*/
        return nums.length-result;
    }

    public static void main(String[] args) {
        //int[] nums = {1,1,2};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Remove_Duplicates_from_Sorted_Array_26 function = new Remove_Duplicates_from_Sorted_Array_26();
        System.out.println(function.removeDuplicates(nums));
    }
}
