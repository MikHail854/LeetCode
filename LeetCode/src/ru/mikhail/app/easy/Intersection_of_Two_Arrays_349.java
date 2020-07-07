package ru.mikhail.app.easy;

import java.util.ArrayList;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 *
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 *
 *  Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class Intersection_of_Two_Arrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList();
        boolean flag = true;
        for (int n1 : nums1) {
            for (int n2 : nums2) {
                if (n1 == n2) {
                    if (list.size() > 0) {
                        for (Integer integer : list) {
                            if (n1 == integer) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            list.add(n1);
                        }
                        flag = true;
                    } else list.add(n1);
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        //int[] nums1 = {1, 2, 2, 1};
        //int[] nums2 = {2, 2};
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        Intersection_of_Two_Arrays_349 function = new Intersection_of_Two_Arrays_349();
        for (int i : function.intersection(nums1, nums2))
            System.out.println(i);
    }
}
