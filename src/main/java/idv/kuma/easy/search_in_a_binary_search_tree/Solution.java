package idv.kuma.easy.search_in_a_binary_search_tree;

import idv.kuma.common.TreeNode;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }


        return searchBST(
                val < root.val
                        ? root.left
                        : root.right
                , val
        );

    }


    public TreeNode searchBSTIteratively(TreeNode root, int val) {

        TreeNode current = root;

        while (current != null) {
            if (val == current.val) {
                break;
            }

            current = val < current.val
                    ? current.left
                    : current.right;
        }

        return current;
    }
}



