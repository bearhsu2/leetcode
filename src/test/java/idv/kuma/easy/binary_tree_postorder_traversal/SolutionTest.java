package idv.kuma.easy.binary_tree_postorder_traversal;

import idv.kuma.common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void name() {
        TreeNode root = new TreeNode(1);

        TreeNode right = new TreeNode(2);

        right.left = new TreeNode(3);

        root.right = right;


        Solution sut = new Solution();

        List<Integer> actual = sut.postorderTraversal(root);

        Assertions.assertThat(actual).isEqualTo(List.of(3, 2, 1));
    }
}