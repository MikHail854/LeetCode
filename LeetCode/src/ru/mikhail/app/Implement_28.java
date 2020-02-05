package ru.mikhail.app;

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
