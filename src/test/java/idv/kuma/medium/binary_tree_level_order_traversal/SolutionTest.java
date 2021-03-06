package idv.kuma.medium.binary_tree_level_order_traversal;

import idv.kuma.common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void name() {

        TreeNode root = new TreeNode(3);

        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);

        root.left = left;
        root.right = right;

        right.left = new TreeNode(15);
        right.right = new TreeNode(7);

        List<List<Integer>> recursive = new Solution().levelOrder(root);

        Assertions.assertThat(recursive).isEqualTo(
                Arrays.asList(
                        Arrays.asList(3),
                        Arrays.asList(9, 20),
                        Arrays.asList(15, 7)
                ));

        List<List<Integer>> iterative = new Solution().levelOrderIterative(root);

        Assertions.assertThat(iterative).isEqualTo(
                Arrays.asList(
                        Arrays.asList(3),
                        Arrays.asList(9, 20),
                        Arrays.asList(15, 7)
                ));
    }
}