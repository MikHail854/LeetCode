package ru.mikhail.app;

/**
 * исправить ошибку (символы должны идти последовательно, если нет, вернуть -1)
 */

/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2

 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1

 * Clarification:
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string.
 * This is consistent to C's strstr() and Java's indexOf().
 */
public class Implement_28 {
    public int strStr(String haystack, String needle) {
        int helper = 0;
        if (needle.length() == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < needle.length(); j++) {
            for (; i < haystack.length(); i++) {
                if (needle.charAt(j) == haystack.charAt(i)) {
                    if (helper > 0) {
                        if (i - (helper) == 0) {
                            if (j == needle.length() - 1) {
                                return i - j;
                            }
                            helper++;
                            i++;
                            break;
                        } else return -1;
                    } else {
                        if (j == needle.length() - 1) {
                            return i - j;
                        }
                        helper++;
                        i++;
                        break;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //String haystack = "hello";
        //String needle = "ll";
        //String haystack = "mississippi";
        //String needle = "issipi";
        String haystack = "aaa";
        String needle = "aa";
        Implement_28 function = new Implement_28();
        System.out.println(function.strStr(haystack, needle));
    }
}
