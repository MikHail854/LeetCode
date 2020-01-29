package ru.mikhail.app;

public class Add_Binary_67 {
    public String addBinary(String a, String b) {
        String result = "";
        int length_first = a.length();
        int length_second = b.length();
        int max_length = 0;
        if (length_first > length_second) {
            max_length = length_first;
        } else max_length = length_second;
        /*int min_length = 0;
        if(length_first < length_second){
            min_length = length_first;
        } else min_length = length_second;*/
        int rezerv = 0;
        boolean flag;
        if (a.length() == 1 && b.length() == 1){
            if (a.charAt(0) == '0' && b.charAt(0) == '0'){
              return "0";
            }else if (a.charAt(0) == '1' && b.charAt(0) == '1'){
                return "10";
            }else return "1";
        }

        for (int i = 0; i < max_length; i++) {
            flag = true;
            if (rezerv == 1) {
                //if (length_first > 0 && length_second > 0) {
                if (length_first == 0) {
                    result = /*b.charAt(length_second - 1) + */"1" + result;
                    rezerv = 0;
                } else if (length_second == 0) {
                    if (a.charAt(length_first -1) == '1'){
                        result = "0" + result;
                        rezerv = 1;
                        //i--;
                    } else result = "1" + result;
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
                //}
                flag = false;
            } else if (rezerv == 0) {
                //if (length_first > 0 && length_second > 0) {
                if (length_first <= 0) {
                    result = b.charAt(length_second - 1) + result;
                } else if (length_second <= 0) {
                    result = a.charAt(length_first - 1) + result;
                } else if (a.charAt(length_first - 1) == '1' && b.charAt(length_second - 1) == '1') {
                    result = "0" + result;
                    rezerv = 1;
                    //i--;
                } else if (a.charAt(length_first - 1) == '1' && b.charAt(length_second - 1) == '0') {
                    result = "1" + result;
                } else if (a.charAt(length_first - 1) == '0' && b.charAt(length_second - 1) == '1') {
                    result = "1" + result;
                } else if (a.charAt(length_first - 1) == '0' && b.charAt(length_second - 1) == '0') {
                    result = "0" + result;
                }
                // }
                length_first--;
                length_second--;
                flag = false;
            }
            if (flag == true) {
                if (length_first > 0) {
                    result = a.charAt(length_first - 1) + result;
                    length_first--;
                }
                if (length_second > 0) {
                    result = b.charAt(length_second - 1) + result;
                    length_second--;
                }
            }
            /*if (rezerv == 1){
                i--;
            }*/
        }
        return result;
    }


    //while (max_length > 0){
            /*if (length_second > 0 || rezerv != 0) {
                if (rezerv == 1) {
                    if (a.charAt(length_first - 1) == '1' && b.charAt(length_second - 1) == '1') {
                        result = 0 + result;
                        rezerv = 1;
                    } else {
                        result = 0 + result;
                        rezerv = 0;
                    }
                    length_first--;
                    length_second--;
                    if (length_second == 0){
                        length_second++;
                    }
                } else {
                    if (a.charAt(length_first - 1) == '1' && b.charAt(length_second - 1) == '1') {
                        result = 0 + result;
                        rezerv = 1;
                    } else {
                        result = 1 + result;
                    }
                    length_first--;
                    length_second--;
                    if (length_second == 0){
                        length_second++;
                    }
                }

            } else {
                result = a.charAt(length_first - 1) + result;
                length_first--;
            }
        }
        return result;
    }*/

        /*while (length_first > 0) {
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
}*/

    public static void main(String[] args) {
        //String a = "11";
        //String b = "1";
//        String a = "1010";
//        String b = "1011";
        //String a = "1";
        //String b = "1";
        //String a = "0";
        //String b = "0";
        String a = "1";
        String b = "111";
        Add_Binary_67 function = new Add_Binary_67();
        System.out.println(function.addBinary(a, b));

    }

}
