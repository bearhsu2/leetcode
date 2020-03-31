package idv.kuma.medium.binary_tree_inorder_traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    private List<Integer> result = new ArrayList<>();


    public List<Integer> inorderTraversal(TreeNode root) {

        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode current = root;
        while (current != null || !(stack.isEmpty())) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.println(current.val);
            result.add(current.val);
            current = current.right;

        }

        return result;
    }

}
