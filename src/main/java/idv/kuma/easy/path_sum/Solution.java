package idv.kuma.easy.path_sum;

import idv.kuma.common.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root.right == null && root.left == null) {
            return targetSum == root.val;
        }

        boolean leftResult = false;
        if (root.left != null) {
            leftResult = hasPathSum(root.left, targetSum - root.val);
        }

        boolean rightResult = false;
        if (root.right != null) {
            rightResult = hasPathSum(root.right, targetSum - root.val);
        }

        return leftResult || rightResult;
    }
}
