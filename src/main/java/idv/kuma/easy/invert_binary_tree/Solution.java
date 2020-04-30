package idv.kuma.easy.invert_binary_tree;

import idv.kuma.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) return root;

        doInvert(root);

        return root;
    }


    private void doInvert(TreeNode root) {

        Deque<TreeNode> stack = new ArrayDeque<>();

        stack.push(root);

        do {

            TreeNode current = stack.pop();

            if (current.left != null) {
                stack.push(current.left);
            }

            if (current.right != null) {
                stack.push(current.right);
            }

            switchChildren(current);

        } while (!stack.isEmpty());


    }


    private void switchChildren(TreeNode current) {
        // switch
        TreeNode temp = current.left;
        current.left = current.right;
        current.right = temp;
    }

}
