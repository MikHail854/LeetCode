package ru.mikhail.app.easy;
/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 * Clarification:
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string.
 * This is consistent to C's strstr() and Java's indexOf().
 */
public class Implement_28 {
    public int strStr(String haystack, String needle) {
        int j = 0;
        boolean index = false;
        if ((haystack.length() == 0 && needle.length() == 0) || needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 1 && needle.length() == 1) {
            if (haystack.charAt(0) == needle.charAt(0)) {
                return 0;
            }
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                index = true;
            }
            if (j == needle.length()) {
                return i - j + 1;
            }
            if (index == false) {
                i = i - j;
                j = 0;
            }
            index = false;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        //String haystack = "mississippi";
        //String needle = "issip";
        //String haystack = "a";
        //String needle = "a";
        Implement_28 function = new Implement_28();
        System.out.println(function.strStr(haystack, needle));
    }
}
