package idv.kuma.easy.sum_of_left_leaves;

public class Solution {

    private int sum = 0;


    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }

        doSumLeft(root, false);

        return sum;

    }


    private void doSumLeft(TreeNode root, boolean isLeft) {

        // add val to sum if root is a left leaf
        if (root.left == null && root.right == null) {
            if (isLeft) {
                sum += root.val;
            }
        }

        if (root.left != null) {
            doSumLeft(root.left, true);
        }

        if (root.right != null) {
            doSumLeft(root.right, false);
        }


    }
}


