package idv.kuma.medium.binary_tree_zigzag_level_order_traversal;

import idv.kuma.common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

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

        Assertions.assertThat(new Solution().zigzagLevelOrder(root))
                .containsExactly(
                        Arrays.asList(3),
                        Arrays.asList(20, 9),
                        Arrays.asList(15, 7)
                );

    }
}