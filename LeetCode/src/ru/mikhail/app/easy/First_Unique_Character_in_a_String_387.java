package ru.mikhail.app.easy;

/**
 * Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.
 *
 * Examples:
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode"
 * return 2.
 */
public class First_Unique_Character_in_a_String_387 {
    public int firstUniqChar(String s) {
        if (s.length() == 0)
            return -1;
        if (s.length() == 1)
            return 0;
        int answer = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                answer++;
                flag = true;
            } else return answer;
        }
        return -1;
    }

    public static void main(String[] args) {
        //String s = "leetcode";
        //String s = "loveleetcode";
        //String s = "aadadaad";
        String s = "dddccdbba";
        First_Unique_Character_in_a_String_387 function = new First_Unique_Character_in_a_String_387();
        System.out.println(function.firstUniqChar(s));
    }
}
