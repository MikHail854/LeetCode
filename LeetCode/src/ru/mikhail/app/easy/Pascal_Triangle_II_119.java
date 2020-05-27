package ru.mikhail.app.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 * Example:
 * Input: 3
 * Output: [1,3,3,1]
 */
public class Pascal_Triangle_II_119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> listAll = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> listUnder = new ArrayList<>();
            listUnder.add(1);
            for (int j = 1; j < i + 1; j++) {
                if (j == i) {
                    listUnder.add(1);
                } else {
                    int helper;
                    helper = listAll.get(i - 1).get(j) + listAll.get(i - 1).get(j - 1);
                    listUnder.add(helper);
                }
            }
            listAll.add(listUnder);
        }
        return listAll.get(rowIndex);
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        Pascal_Triangle_II_119 function = new Pascal_Triangle_II_119();
        System.out.println(function.getRow(rowIndex));
    }
}
