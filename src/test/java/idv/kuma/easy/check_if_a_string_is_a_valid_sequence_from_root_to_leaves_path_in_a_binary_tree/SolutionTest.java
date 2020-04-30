package idv.kuma.easy.check_if_a_string_is_a_valid_sequence_from_root_to_leaves_path_in_a_binary_tree;

import idv.kuma.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name1() {

        TreeNode root = new TreeNode(8);

        TreeNode left = new TreeNode(3);
        root.left = left;

        int[] arr = new int[]{8};

        Assert.assertEquals(false, new Solution().isValidSequence(root, arr));
    }

    @Test
    public void name2() {

        TreeNode root = new TreeNode(0);

        TreeNode left = new TreeNode(1);
        root.left = left;

        TreeNode right = new TreeNode(0);
        root.right = right;

        TreeNode leftLeft = new TreeNode(0);
        left.left = leftLeft;

        TreeNode leftRight = new TreeNode(1);
        left.right = leftRight;

        int[] arr = new int[]{0,0,1};

        Assert.assertEquals(false, new Solution().isValidSequence(root, arr));
    }
}