package idv.kuma.medium.validate_binary_search_tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    long last = Long.MIN_VALUE;


    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        if (!isValidBST(root.left)) {
            return false;
        }

        if (root.val <= last) {
            return false;
        }
        last = root.val;

        return isValidBST(root.right);

    }


    public boolean isValidBSTIteratively(TreeNode root) {

        if (root == null) {
            return true;
        }

        TreeNode previous = null;
        TreeNode current = root;
        Deque<TreeNode> stack = new ArrayDeque<>();

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if (previous != null && current.val <= previous.val) {
                return false;
            }

            previous = current;
            current = current.right;

        }

        return true;

    }
}

