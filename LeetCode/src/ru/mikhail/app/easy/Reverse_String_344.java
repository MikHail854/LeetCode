package ru.mikhail.app.easy;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do
 * this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class Reverse_String_344 {
    public void reverseString(char[] s) {
        char helper;
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            helper = s[i];
            s[i] = s[j];
            s[j] = helper;
            j--;
        }

    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        Reverse_String_344 function = new Reverse_String_344();
        function.reverseString(s);
        System.out.println(s);
    }
}
