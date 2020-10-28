package ru.mikhail.app.easy;

/**
 * You are given two strings s and t.
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * Return the letter that was added to t.
 *
 * Example 1:
 * Input: s = "abcd", t = "abcde"
 * Output: "e"
 * Explanation: 'e' is the letter that was added.
 *
 * Example 2:
 * Input: s = "", t = "y"
 * Output: "y"
 *
 *  Example 3:
 * Input: s = "a", t = "aa"
 * Output: "a"
 *
 * Example 4:
 * Input: s = "ae", t = "aea"
 * Output: "a"
 *
 * Constraints:
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s and t consist of lower-case English letters.
 */
public class Find_the_Difference_389 {

    public char findTheDifference(String s, String t) {
        if (t.length() == 1) {
            return t.charAt(0);
        }

        char[] s_mas = new char[s.length()];
        char[] t_mas = new char[t.length()];

        for (int i = 0; i < s.length(); i++) {
            s_mas[i] = s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            t_mas[i] = t.charAt(i);
        }
        int t_mas_length = t_mas.length;
        int s_mas_length = s_mas.length;
        for (int i = 0; i < t_mas_length; i++) {
            for (int j = 0; j < s_mas_length; j++) {
                if (s_mas[j] == t_mas[i]) {
                    for (; j < s_mas_length - 1; j++) {
                        s_mas[j] = s_mas[j + 1];
                    }
                    for (; i < t_mas_length - 1; i++) {
                        t_mas[i] = t_mas[i + 1];
                    }
                    s_mas_length--;
                    t_mas_length--;
                    i = -1;
                    break;
                }
            }
        }
        return t_mas[0];
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        Find_the_Difference_389 function = new Find_the_Difference_389();
        System.out.println(function.findTheDifference(s, t));
    }
}