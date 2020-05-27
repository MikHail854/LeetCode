package ru.mikhail.app.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
  * Input: ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
  * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class Longest_Common_Prefix_14 {

    public String longestCommonPrefix(String[] strs) {
        /**
         * char charAt(int index) — возвращает символ, находящийся по указанному индексу в строке.
         * Результатом работы метода будет символ типа char.
         */
        String result = "";
        if (strs.length == 0){
            return "";
        }
        int min = strs[0].length();
        int help = 1;
        for (int t = 0; t < strs.length; t++){
            if (strs[t].length() < min){
                min = strs[t].length();
            }
        }
        for (int i = 0; i < min; i++){
            help = 1;
            for (int j = 1; j < strs.length; j++){
                if (strs[0].charAt(i) == strs[j].charAt(i)){
                    help++;
                } else return result;
                if (help == strs.length){
                    result = result + strs[0].charAt(i);
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] mass = new String[] {"flower","flow","flight"};
        //String[] mass = new String[] {"dog","racecar","car"};
        //String[] mass = new String[] {"c","c"};
        Longest_Common_Prefix_14 function = new Longest_Common_Prefix_14();
        System.out.println(function.longestCommonPrefix(mass));
    }
}
