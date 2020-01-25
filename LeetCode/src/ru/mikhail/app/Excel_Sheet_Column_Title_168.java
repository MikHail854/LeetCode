package ru.mikhail.app;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * For example:
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * Example 1:
 * Input: 1
 * Output: "A"

 * Example 2:
 * Input: 28
 * Output: "AB"

 * Example 3:
 * Input: 701
 * Output: "ZY"
 */
public class Excel_Sheet_Column_Title_168 {
    public String convertToTitle(int n) {
        String result = "";
        if (n <= 0)
            return result;
        while (n > 0) {
            n--;
            int last = n % 26;
            result = ((char) (last + 65)) + result;
            n = n / 26;
        }
        return result;
    }

    public static void main(String[] args) {
        //int input = 703;
        //int input = 1048;
        int input = 24568;
        Excel_Sheet_Column_Title_168 function = new Excel_Sheet_Column_Title_168();
        System.out.println(function.convertToTitle(input));
    }
}
