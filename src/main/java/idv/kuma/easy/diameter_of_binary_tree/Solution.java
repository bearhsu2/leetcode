package idv.kuma.easy.diameter_of_binary_tree;

import idv.kuma.common.TreeNode;

public class Solution {

    int maxDiameter = Integer.MIN_VALUE;


    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        findDepth(root);

        return maxDiameter;
    }


    private int findDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);

        maxDiameter = Math.max(leftDepth + rightDepth, maxDiameter);

        return Math.max(leftDepth, rightDepth) + 1;

    }
}
