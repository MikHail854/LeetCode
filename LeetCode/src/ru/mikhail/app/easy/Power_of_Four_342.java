package ru.mikhail.app.easy;

/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 *
 * Example 1:
 * Input: 16
 * Output: true
 *
 * Example 2:
 * Input: 5
 * Output: false
 *
 * Follow up: Could you solve it without loops/recursion?
 */
public class Power_of_Four_342 {
    public boolean isPowerOfFour(int num){
        if (num == 1)
            return true;
        while (num >= 4){
            if (num % 4 == 0){
                if (num == 4)
                    return true;
                else num = num / 4;
            }
            else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Power_of_Four_342 function = new Power_of_Four_342();
        int num = 16;
        System.out.println(function.isPowerOfFour(num));
    }
}
