package ru.mikhail.app.easy;

import java.util.ArrayList;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
 *
 * Example 1:
 * Input: "hello"
 * Output: "holle"
 *
 * Example 2:
 * Input: "leetcode"
 * Output: "leotcede"
 *
 * Note:
 * The vowels does not include the letter "y".
 */


public class Reverse_Vowels_of_a_String_345 {
    /**
     * Bad decision. Long run
     */
    public String reverseVowels(String s) {

        if (s.length() == 0) {
            return s;
        }
        ArrayList vowels_list = new ArrayList();
        ArrayList s_list = new ArrayList();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' ||
                    s.charAt(i) == 'U' || s.charAt(i) == 'I' ||
                    s.charAt(i) == 'O') {
                vowels_list.add(s.charAt(i));
            }
            s_list.add(s.charAt(i));
        }

        int j = vowels_list.size() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' ||
                    s.charAt(i) == 'U' || s.charAt(i) == 'I' ||
                    s.charAt(i) == 'O') {
                s_list.set(i, vowels_list.get(j));
                j--;
            }
        }
        s = "";
        for (Object o : s_list) {
            s += o;
        }
        return s;
    }

    public static void main(String[] args) {
        //String s = "hello";
        String s = "Yo! Bottoms up, U.S. Motto, boy!";
        Reverse_Vowels_of_a_String_345 function = new Reverse_Vowels_of_a_String_345();
        System.out.println(function.reverseVowels(s));
    }
}
