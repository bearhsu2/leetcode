package idv.kuma.easy.search_in_a_binary_search_tree;

import idv.kuma.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        TreeNode root = new TreeNode(4);

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(7);

        root.left = left;
        root.right = right;

        left.left = new TreeNode(1);
        left.right = new TreeNode(3);

        TreeNode recursive = new Solution().searchBST(root, 2);

        Assert.assertEquals(left, recursive);

        TreeNode iteratively = new Solution().searchBSTIteratively(root, 2);

        Assert.assertEquals(left, iteratively);
    }
}