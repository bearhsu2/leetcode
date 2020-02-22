package idv.kuma.easy.sum_of_left_leaves;

public class Solution {

    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        doSumLeft(root, false);
        return sum;
    }


    private void doSumLeft(TreeNode root, boolean isLeft) {

        if (root == null) {
            return;
        }

        // add val to sum if root is a left leaf
        if (isLeaf(root) && isLeft) {
            sum += root.val;
        }

        doSumLeft(root.left, true);
        doSumLeft(root.right, false);

    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}


