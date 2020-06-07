package ru.mikhail.app.hard;

import java.util.ArrayList;

/**
 * In a given integer array A, we must move every element of A to either list B or list C.
 * (B and C initially start empty.)
 *
 * Return true if and only if after such a move,
 * it is possible that the average value of B is equal to the average value
 * of C, and B and C are both non-empty.
 *
 * Example :
 * Input:
 * [1,2,3,4,5,6,7,8]
 * Output: true
 *
 * Explanation: We can split the array into [1,4,5,8] and [2,3,6,7],
 * and both of them have the average of 4.5.
 *
 * Note:
 * The length of A will be in the range [1, 30].
 * A[i] will be in the range of [0, 10000].
 */
public class Split_Array_With_Same_Average_805 {
    public boolean splitArraySameAverage(int[] A) {
        ArrayList<Integer> B = new ArrayList<>();
        B.add(A[0]);
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A[1]);
        int sumB = 0;
        int sumC = 0;

        for (int i = 2; i < A.length - 1; i = i + 2) {
            if (((B.get(0) + A[i]) / 2) == ((C.get(0) + A[i + 1]) / 2)) {
                B.add(A[i]);
                C.add(A[i + 1]);
            } else {
                B.add(A[i + 1]);
                C.add(A[i]);
            }
        }
        for (int i = 0; i < B.size(); i++) {
            sumB += B.get(i);
            sumC += C.get(i);
        }
        if (sumB / B.size() == sumC / C.size()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        //int[] A = {1,2,3,4,5,6,7,8};
        //int[] A = {3, 1};
        int[] A = {2, 0, 5, 6, 16, 12, 15, 12, 4};
        Split_Array_With_Same_Average_805 function = new Split_Array_With_Same_Average_805();
        System.out.println(function.splitArraySameAverage(A));
    }
}
