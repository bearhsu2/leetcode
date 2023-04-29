package idv.kuma.easy.binary_tree_postorder_traversal;

import idv.kuma.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        doPreorderTraversal(result, root);

        return result;
    }

    private void doPreorderTraversal(List<Integer> result, TreeNode node) {

        if (node == null) {
            return;
        }

        doPreorderTraversal(result, node.left);
        doPreorderTraversal(result, node.right);
        result.add(node.val);
    }
}
