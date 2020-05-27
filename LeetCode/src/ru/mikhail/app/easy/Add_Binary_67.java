package ru.mikhail.app.easy;

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class Add_Binary_67 {
    public String addBinary(String a, String b) {
        String result = "";
        String helper;
        if (a.length() < b.length()) {
            helper = a;
            a = b;
            b = helper;
        }
        int length_first = a.length();
        int length_second = b.length();
        int max_length = 0;
        if (length_first > length_second) {
            max_length = length_first;
        } else max_length = length_second;
        int rezerv = 0;
        if (a.length() == 1 && b.length() == 1) {
            if (a.charAt(0) == '0' && b.charAt(0) == '0') {
                return "0";
            } else if (a.charAt(0) == '1' && b.charAt(0) == '1') {
                return "10";
            } else return "1";
        }

        for (int i = 0; i < max_length + 1; i++) {
            if (rezerv == 1) {
                if (length_first == 0) {
                    result = "1" + result;
                    rezerv = 0;
                } else if (length_second <= 0) {
                    if (a.charAt(length_first - 1) == '1') {
                        result = "0" + result;
                        rezerv = 1;
                    } else {
                        result = "1" + result;
                        rezerv = 0;
                    }
                } else if (a.charAt(length_first - 1) == '1' && b.charAt(length_second - 1) == '1') {
                    result = "1" + result;
                    rezerv = 1;
                } else if (a.charAt(length_first - 1) == '1' && b.charAt(length_second - 1) == '0') {
                    result = "0" + result;
                    rezerv = 1;
                } else if (a.charAt(length_first - 1) == '0' && b.charAt(length_second - 1) == '1') {
                    result = "0" + result;
                    rezerv = 1;
                } else if (a.charAt(length_first - 1) == '0' && b.charAt(length_second - 1) == '0') {
                    result = "1" + result;
                    rezerv = 0;
                }
                length_first--;
                length_second--;
            } else if (rezerv == 0) {
                if (length_first <= 0) {
                    break;
                } else if (length_second <= 0) {
                    result = a.charAt(length_first - 1) + result;
                } else if (a.charAt(length_first - 1) == '1' && b.charAt(length_second - 1) == '1') {
                    result = "0" + result;
                    rezerv = 1;
                } else if (a.charAt(length_first - 1) == '1' && b.charAt(length_second - 1) == '0') {
                    result = "1" + result;
                } else if (a.charAt(length_first - 1) == '0' && b.charAt(length_second - 1) == '1') {
                    result = "1" + result;
                } else if (a.charAt(length_first - 1) == '0' && b.charAt(length_second - 1) == '0') {
                    result = "0" + result;
                }
                length_first--;
                length_second--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //String a = "11";
        //String b = "1";
//        String a = "1010";
//        String b = "1011";
        //String a = "1";
        //String b = "1";
        //String a = "0";
        //String b = "0";
        //String a = "1";
        //String b = "111";
        //String a = "100";
        //String b = "110010";
        String a = "101111";
        String b = "10";
        Add_Binary_67 function = new Add_Binary_67();
        System.out.println(function.addBinary(a, b));

    }

}
