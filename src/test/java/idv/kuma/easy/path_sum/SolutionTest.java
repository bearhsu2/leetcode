package idv.kuma.easy.path_sum;

import idv.kuma.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        TreeNode root = new TreeNode(5);

        TreeNode left = new TreeNode(4);
        root.left = left;


        TreeNode leftLeft = new TreeNode(11);
        left.left = leftLeft;

        TreeNode leftLeftLeft = new TreeNode(7);
        leftLeft.left = leftLeftLeft;

        TreeNode leftLeftRight = new TreeNode(2);
        leftLeft.right = leftLeftRight;

        TreeNode right = new TreeNode(8);
        root.right = right;


        TreeNode rightLeft = new TreeNode(13);
        right.left = rightLeft;

        TreeNode rightRight = new TreeNode(4);
        right.right = rightRight;

        TreeNode rightRightRight = new TreeNode(1);
        rightRight.right = rightRightRight;

        Assert.assertTrue(new Solution().hasPathSum(root, 22));


    }
}