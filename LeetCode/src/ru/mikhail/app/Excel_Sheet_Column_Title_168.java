package ru.mikhail.app;

public class Excel_Sheet_Column_Title_168 {
    public String convertToTitle(int n) {

        String[] symbol = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String result = "";
        int helper;
        while (n > 0) {
            if (n < 27) {
                result += symbol[n - 1];
                return result;
            } else {
                helper = n / 26;
                if (n % 26 == 0) {
                    helper--;
                }

                if (helper == 27) {
                    result += symbol[0];
                    n -= 26 * 26;
                }

                if (helper < 27) {
                    result = symbol[helper - 1] + result;
                    n -= 26 * helper;
                }
                if (helper > 27) {
                    result = symbol[helper - 1 - 26] + result;
                    n -= 26 * helper - 26;
                }
            }
        }
        return result;
    }
//        String sol = "";
//        if(n <= 0)
//            return sol;
//        while(n > 0){
//            n--;
//            int last = n%26;
//            sol = ((char)(last + 65)) + sol;
//            n = n/26;
//        }
//        return sol;
//}

    public static void main(String[] args) {
        //int input = 703;
        //int input = 1048;
        int input = 24568;
        Excel_Sheet_Column_Title_168 function = new Excel_Sheet_Column_Title_168();
        System.out.println(function.convertToTitle(input));
    }
}
