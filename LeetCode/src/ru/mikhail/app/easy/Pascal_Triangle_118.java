package ru.mikhail.app.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * Example:
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class Pascal_Triangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listAll = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            List<Integer> listUnder = new ArrayList<>();
            listUnder.add(1);
            for (int j = 1; j < i + 1; j++){
                if (j == i){
                    listUnder.add(1);
                } else {
                    int helper;
                    int k = 0;
                    helper = listAll.get(i -1).get(j) + listAll.get(i -1).get(j-1);
                    listUnder.add(helper);
                }
            }
            listAll.add(listUnder);
        }
        return listAll;
    }

    public static void main(String[] args) {
        int numRows = 5;
        Pascal_Triangle_118 function = new Pascal_Triangle_118();
        System.out.println(function.generate(numRows));
    }
}
