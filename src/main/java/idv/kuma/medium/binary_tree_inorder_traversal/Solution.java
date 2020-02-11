package idv.kuma.medium.binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> result = new ArrayList<>();


    public List<Integer> inorderTraversal(TreeNode root) {


        doTraversal(root);

        return result;
    }


    private void doTraversal(TreeNode root) {
        if (root == null) {
            return;
        }


        doTraversal(root.left);
        result.add(root.val);
        doTraversal(root.right);
    }
}
