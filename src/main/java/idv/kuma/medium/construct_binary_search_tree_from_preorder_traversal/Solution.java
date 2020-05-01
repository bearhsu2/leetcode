package idv.kuma.medium.construct_binary_search_tree_from_preorder_traversal;

import idv.kuma.common.TreeNode;

public class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {

        //tree
        int length = preorder.length;
        if (length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            insert(root, node);
        }

        return root;
    }


    private void insert(TreeNode root, TreeNode node) {

        if (root.val < node.val) { // should go right

            if (root.right != null) {
                insert(root.right, node);
            } else {
                root.right = node;
            }

        } else { // should go left

            if (root.left != null) {
                insert(root.left, node);
            } else {
                root.left = node;
            }

        }
    }
}
