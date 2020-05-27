package ru.mikhail.app;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

public class Merge_Two_Sorted_Lists_21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode m;
        if (l1.val <= l2.val) {
            m = l1;
            l1 = l1.next;
        } else {
            m = l2;
            l2 = l2.next;
        }
        ListNode start = m;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                m.next = l1;
                l1 = l1.next;
            } else {
                m.next = l2;
                l2 = l2.next;
            }
            m = m.next;
        }
        if (l1 == null) {
            m.next = l2;
        } else {
            m.next = l1;
        }
        return start;
    }

    public static void main(String[] args) {

    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
