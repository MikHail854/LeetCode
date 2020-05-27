package ru.mikhail.app.easy;

/**
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 *
 * Note:
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 *  Example:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class Two_Sum_II_167 {
    public int[] twoSum(int[] numbers, int target) {
//        int[] result = {0, 0};
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = 1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target && i != j) {
//                    /*result[0] = i + 1;
//                    result[1] = j + 1;*/
//                    //return result;
//                    numbers[0] = i+1;
//                    numbers[1] = j+1;
//                    return numbers /*result*/;
//                }
//            }
//        }
//        return numbers /*result*/;

        int[] result = {0, 0};
        int j = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            //for (int j = 1; j < numbers.length; j++) {
            if (numbers[i] + numbers[j] == target && i != j) {
                    /*result[0] = i + 1;
                    result[1] = j + 1;*/
                //return result;
                numbers[0] = i + 1;
                numbers[1] = j + 1;
                return numbers /*result*/;
            } else {
                if (j == numbers.length-1) {
                    j = 1;
                } else {
                    i--;
                    j++;
                }

            }
        }
        return numbers /*result*/;
    }

    public static void main(String[] args) {
        //int[] numbers = {2, 7, 11, 15};
        //int target = 9;
        int[] numbers = {2, 3, 4};
        int target = 6;
        Two_Sum_II_167 function = new Two_Sum_II_167();
        function.twoSum(numbers, target);
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }
    }
}
