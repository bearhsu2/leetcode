package idv.kuma.easy.validate_binary_search_tree;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void Single_Point() {

        TreeNode head = new TreeNode(3);

        Assert.assertTrue(
                new Solution().isValidBST(head)
        );

    }


    @Test
    public void Has_Smaller_Left_Then_True() {

        TreeNode head = new TreeNode(3);

        TreeNode left = new TreeNode(2);
        head.left = left;

        Assert.assertTrue(
                new Solution().isValidBST(head)
        );

    }


    @Test
    public void Has_Larger_Left_Then_False() {

        TreeNode head = new TreeNode(3);

        TreeNode left = new TreeNode(4);
        head.left = left;

        Assert.assertFalse(
                new Solution().isValidBST(head)
        );

    }
}