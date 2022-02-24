package idv.kuma.easy.minimum_depth_of_binary_tree;

import idv.kuma.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        TreeNode root = new TreeNode(3);

        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);

        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);

        root.left = left;
        root.right = right;

        right.left = rightLeft;
        right.right = rightRight;

        Assert.assertEquals(2, new Solution().minDepth(root));
    }
}