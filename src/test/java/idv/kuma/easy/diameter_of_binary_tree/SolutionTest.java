package idv.kuma.easy.diameter_of_binary_tree;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {

        TreeNode root = new TreeNode(1);

        TreeNode left = new TreeNode(2);
        root.left = left;

        TreeNode right = new TreeNode(3);
        root.right = right;

        TreeNode leftLeft = new TreeNode(4);
        left.left = leftLeft;

        TreeNode leftRight = new TreeNode(5);
        left.right = leftRight;

        Assert.assertEquals(3, new Solution().diameterOfBinaryTree(root));


    }
}