package idv.kuma.easy.sum_of_left_leaves;

public class Solution {


    public int sumOfLeftLeaves(TreeNode root) {
        return doSumLeft(root, false);
    }


    private int doSumLeft(TreeNode root, boolean isLeft) {

        if (root == null) {
            return 0;
        }

        // add val to sum if root is a left leaf
        if (isLeaf(root) && isLeft) {
            return root.val;
        }

        return doSumLeft(root.left, true)
                + doSumLeft(root.right, false);

    }


    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}


