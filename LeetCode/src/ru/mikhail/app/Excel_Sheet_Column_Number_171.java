package ru.mikhail.app;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 *
 *  Example 1:
 * Input: "A"
 * Output: 1
 *
 * Example 2:
 * Input: "AB"
 * Output: 28
 *
 * Example 3:
 * Input: "ZY"
 * Output: 701
 */
public class Excel_Sheet_Column_Number_171 {
    public int titleToNumber(String s) {
        int result = s.charAt(0) - 64;
        for (int i = 1; i < s.length(); i++){
                result = (s.charAt(i)- 64) + result * 26;
        }
        return result;
    }

    public static void main(String[] args) {
        //String s = "A";
        String s = "AB";
        Excel_Sheet_Column_Number_171 function = new Excel_Sheet_Column_Number_171();
        System.out.println(function.titleToNumber(s));
    }
}
