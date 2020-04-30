package idv.kuma.hard.binary_tree_maximum_path_sum;

import idv.kuma.common.TreeNode;

class Solution {

    int globalMax = Integer.MIN_VALUE;


    public int maxPathSum(TreeNode root) {

        findMax(root);

        return globalMax;

    }


    private int findMax(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftSum = Math.max(findMax(root.left), 0);
        int rightSum = Math.max(findMax(root.right), 0);

        globalMax = Math.max(root.val + leftSum + rightSum, globalMax);

        return root.val + Math.max(leftSum, rightSum);

    }

}