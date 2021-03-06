package ru.mikhail.app.easy;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a maximal substring consisting of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */

public class Length_of_Last_Word_58 {

    public int lengthOfLastWord(String s) {
        int output = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                output++;
            } else if (output > 0)
                break;
        }
        return output;
    }

    public static void main(String[] args) {
        //String input = "Hello World";
        //String input = "a ";
        //String input = " a ";
        String input = "Today is a nice day";
        Length_of_Last_Word_58 function = new Length_of_Last_Word_58();
        System.out.println(function.lengthOfLastWord(input));
    }
}
