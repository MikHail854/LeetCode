package ru.mikhail.app;

public class Valid_Palindrome_125 {
    public boolean isPalindrome(String s) {
        String helper = "";
        int left = 0;
        int right = s.length()-1;
        for (; left < right; left++) {
            if (s.charAt(left) == ' ' || s.charAt(left) == ',' || s.charAt(left) == ':') {
                left++;
            }
            if (s.charAt(right) == ' ' || s.charAt(right) == ',' || s.charAt(right) == ':') {
                right--;
            }
            /*if (s.equalsIgnoreCase(s.charAt(i)) != s.equalsIgnoreCase(s.charAt(s.length() - 1))) {
                return false;
            }*/
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        Valid_Palindrome_125 function = new Valid_Palindrome_125();
        System.out.println(function.isPalindrome(s));
    }
}
