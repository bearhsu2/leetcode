package idv.kuma.easy.sum_of_left_leaves;

import idv.kuma.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {

        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);

        root.left = left;
        root.right = right;


        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);

        right.left = rightLeft;
        right.right = rightRight;


        int actual = new Solution().sumOfLeftLeaves(root);

        Assert.assertEquals(24, actual);

    }
}