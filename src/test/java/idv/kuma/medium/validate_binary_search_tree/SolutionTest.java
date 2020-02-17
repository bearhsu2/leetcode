package idv.kuma.medium.validate_binary_search_tree;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void name00() {

        TreeNode root = new TreeNode(Integer.MIN_VALUE);

        Assert.assertTrue(new Solution().isValidBST(root));
        Assert.assertTrue(new Solution().isValidBSTIteratively(root));
    }
    @Test
    public void name0() {

        TreeNode root = new TreeNode(0);

        TreeNode left = new TreeNode(-1);

        root.left = left;

        Assert.assertTrue(new Solution().isValidBST(root));
        Assert.assertTrue(new Solution().isValidBSTIteratively(root));
    }

    @Test
    public void name() {

        TreeNode root = new TreeNode(2);

        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);

        root.left = left;
        root.right = right;

        Assert.assertTrue(new Solution().isValidBST(root));
        Assert.assertTrue(new Solution().isValidBSTIteratively(root));
    }


    @Test
    public void name2() {

        TreeNode root = new TreeNode(5);

        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(4);

        root.left = left;
        root.right = right;

        TreeNode rightLeft = new TreeNode(3);
        TreeNode rightRight = new TreeNode(6);

        right.left = rightLeft;
        right.right = rightRight;

        Assert.assertFalse(new Solution().isValidBST(root));
        Assert.assertFalse(new Solution().isValidBSTIteratively(root));

    }
}