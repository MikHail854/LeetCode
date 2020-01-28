package ru.mikhail.app;

public class Add_Binary_67 {
    public String addBinary(String a, String b) {
        String result = "";
        int length_first = a.length();
        int length_second = b.length();
        while (length_first > 0) {
            if (a.charAt(length_first - 1) == '1' && b.charAt(length_second - 1) == '1') {
                result = 0 + result;
            } else {
                result = 1 + result;
            }

            length_first--;
            length_second--;
            if (length_first == 0 || length_second == 0){
                b = "0";
                length_second++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        Add_Binary_67 function = new Add_Binary_67();
        System.out.println(function.addBinary(a, b));

    }

}
