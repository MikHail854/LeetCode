package ru.mikhail.app.easy;

import java.util.ArrayList;

/**
 * A binary tree is univalued if every node in the tree has the same value.
 *
 * Return true if and only if the given tree is univalued.
 *
 *
 * Note:
 * 1) The number of nodes in the given tree will be in the range [1, 100].
 * 2) Each node's value will be an integer in the range [0, 99].
 */
public class Univalued_Binary_Tree_965 {

    ArrayList<Integer> listVals;

    public boolean isUnivalTree(TreeNode root) {
        listVals = new ArrayList();
        function(root);
        for (Object v : listVals) {
            if (v != listVals.get(0))
                return false;
        }
        return true;
    }

    public void function(TreeNode node) {
        if (node != null) {
            listVals.add(node.val);
            function(node.left);
            function(node.right);

        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
