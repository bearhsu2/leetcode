package idv.kuma.medium.maximum_difference_between_node_and_ancestor;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);

        root.left.left = new TreeNode(1);

        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);

        root.right = new TreeNode(10);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

        Assert.assertEquals(
                7,
                new Solution().maxAncestorDiff(root)
        );


    }


}