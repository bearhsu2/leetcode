package idv.kuma.medium.binary_tree_inorder_traversal;

import idv.kuma.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {


    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();


        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));

        return result;
    }

}
