package ru.mikhail.app.easy;

import java.util.ArrayList;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter
 * in pattern and a non-empty word in str.
 *
 * Example 1:
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 *
 *  Example 2:
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 *
 *  Example 3:
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 *
 *  Example 4:
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 *
 *  Notes:
 * You may assume pattern contains only lowercase letters,
 * and str contains lowercase letters that may be separated by a single space.
 */

public class Word_Pattern_290 {
    public boolean wordPattern(String pattern, String str) {
        if (pattern.length() == 1) {
            return true;
        }
        ArrayList patternList = new ArrayList();
        ArrayList strList = new ArrayList();

        /**
         * заполение колеекции паттерна
         */
        for (int i = 0; i < pattern.length(); i++) {
            patternList.add(pattern.charAt(i));
        }

        /**
         * замена одинаковых элементов колеекции паттерна на числа
         */
        int value = 0;
        Object ch;
        boolean flag = true;
        for (int i = 0; i < patternList.size(); i++) {
            ch = patternList.get(i);
            if (ch instanceof Character) {

                //} else {

                for (int j = i + 1; j < patternList.size(); j++) {
                    if (ch == patternList.get(j)) {
                        patternList.set(i, value);
                        patternList.set(j, value);
                        flag = false;
                    }
                }
                if (flag == true) {
                    patternList.set(i, value);
                }
                value++;
                flag = true;
            }
        }

        String strHelper = "";

        /**
         * заполение колеекции строки
         */
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                strList.add(strHelper);
                strHelper = "";
            } else {
                strHelper += str.charAt(i);
            }
            if (i == str.length() - 1) {
                strList.add(strHelper);
            }
        }

        /**
         * замена одинаковых элементов колеекции строки на числа
         */
        value = 0;
        for (int i = 0; i < strList.size(); i++) {
            ch = strList.get(i);
            if (ch instanceof String) {

                for (int j = i + 1; j < strList.size(); j++) {
                    if (strList.get(j).toString().equals(ch)) {
                        strList.set(i, value);
                        strList.set(j, value);
                        flag = false;
                    }
                }
                if (flag == true) {
                    strList.set(i, value);
                }
                value++;
                flag = true;
            }
        }

        /**
         * сравнение коллекции паттерна и строк
         */
        if (patternList.size() != strList.size()) {
            return false;
        }
        for (int i = 0; i < patternList.size(); i++) {
            if (patternList.get(i) != strList.get(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        //String pattern = "abba";
        //String str = "dog cat cat fish";
        //String pattern = "abc";
        //String str = "b c a";
        Word_Pattern_290 function = new Word_Pattern_290();
        System.out.println(function.wordPattern(pattern, str));
    }
}
