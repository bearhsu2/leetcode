package idv.kuma.easy.balanced_binary_tree;

public class Solution {
    public boolean isBalanced(TreeNode root) {

        return -1 != getBalancedDepth(root);

    }


    private int getBalancedDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }


        int leftDepth = getBalancedDepth(root.left);
        int rightDepth = getBalancedDepth(root.right);

        if (-1 == leftDepth) {
            return -1;
        }

        if (-1 == rightDepth) {
            return -1;
        }

        if (Math.abs(leftDepth - rightDepth) >1) {
            return -1;
        }


        return 1 + Math.max(leftDepth, rightDepth);
    }
}
