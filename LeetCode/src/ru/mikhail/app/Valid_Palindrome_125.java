package ru.mikhail.app;

public class Valid_Palindrome_125 {
    public boolean isPalindrome(String s) {
        String helper = "";
        int length_string = s.length();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == ',' || s.charAt(i) == ':') {
                i++;
            }
            if (s.charAt(length_string - 1) == ' ' || s.charAt(length_string - 1) == ',' || s.charAt(length_string - 1) == ':') {
                length_string--;
            }
            /*if (s.equalsIgnoreCase(s.charAt(i)) != s.equalsIgnoreCase(s.charAt(s.length() - 1))) {
                return false;
            }*/
            length_string--;
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
