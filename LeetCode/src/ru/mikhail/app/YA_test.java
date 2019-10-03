package ru.mikhail.app;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Дан список целых чисел, повторяющихся элементов в списке нет.
 * Нужно преобразовать это множество в строку,
 * сворачивая соседние числа в диапазоны.
 *
 * Примеры:
 * - [1, 4, 5, 2, 3, 9, 8, 11, 0] => "0-5,8-9,11"
 * - [1, 4, 3, 2] => "1-4"
 * - [1, 4] => "1,4"
 */

public class YA_test {
    String compress(ArrayList<Integer> in) {
        Collections.sort(in);
        String result = "" + in.get(0);
        int help = 0;
        int i = 1;
        for (i = 1; i < in.size(); i++){
            if (in.get(i) - in.get(i-1) != 1){
                if (in.size() == 2){
                    if (in.get(i) - in.get(i-1) != 1){
                        result += "," + in.get(i);
                    }
                    else {
                        result += "-" + in.get(i);
                    }
                }else {
                result += "-" + in.get(i-1) + "," + in.get(i);}
                help++;
            }
        }
        if(help == 0){
            result += "-" + in.get(in.size()-1);
        }
        return result;
    }
    public static void main(String[] args){
        ArrayList<Integer> in = new ArrayList<Integer>();

        in.add(new Integer(1));
        in.add(new Integer(4));
        in.add(new Integer(3));
        in.add(new Integer(2));

//        in.add(new Integer(1));
//        in.add(new Integer(4));
//        in.add(new Integer(5));
//        in.add(new Integer(2));
//        in.add(new Integer(3));
//        in.add(new Integer(9));
//        in.add(new Integer(8));
//        in.add(new Integer(11));
//        in.add(new Integer(0));

//        in.add(new Integer(1));
//        in.add(new Integer(4));
        YA_test function = new YA_test();
        System.out.println(function.compress(in));
    }
}

