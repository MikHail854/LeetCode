package ru.mikhail.app.easy;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]

 * Explanation: The array represents the integer 123.

 * Example 2:
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]

 * Explanation: The array represents the integer 4321.
 */
public class Plus_One_66 {
    public int[] plusOne(int[] digits) {
        int number = digits.length;
        int help = 1;
        int quantity_9 = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 9) {
                quantity_9++;
            }
        }
        if (quantity_9 == digits.length) {
            int[] digits2 = new int[digits.length + 1];
            while (digits[number - 1] == 9) {
                digits2[digits2.length - help - 1] = 1;
                digits2[digits2.length - help] = 0;
                number--;
                help++;
                if (number == 0) {
                    break;
                }
            }
            return digits2;
        } else {
            if (digits[digits.length - 1] == 9) {
                number--;
                while (digits[number] + 1 >= 10) {
                    digits[digits.length - help] = 0;
                    digits[digits.length - help - 1] += 1;
                    number--;
                    if (number == 0 || digits[digits.length - help - 1] == 9) {
                        break;
                    }
                    help++;
                }
            } else {
                digits[digits.length - 1] += 1;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        //int[] digits = {1,2,3};
        int[] digits = {9, 9};
        //int[] digits = {8, 9, 9, 9};
        //int[] digits = {5, 2, 2, 6, 5, 7, 1, 9, 0, 3, 8, 6, 8, 6, 5, 2, 1, 8, 7, 9, 8, 3, 8, 4, 7, 2, 5, 8, 9};
        //int[] digits = { 4, 7, 2, 5, 8, 9};
        Plus_One_66 function = new Plus_One_66();
        digits = function.plusOne(digits);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}
