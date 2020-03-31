package idv.kuma.medium.binary_tree_level_order_traversal;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {

    List<List<Integer>> result;


    public List<List<Integer>> levelOrder(TreeNode root) {
        result = new ArrayList<>();
        doBfs(0, root);
        return result;
    }


    private void doBfs(int level, TreeNode root) {

        if (root == null) {
            return;
        }

        if (result.size() < level + 1) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(root.val);

        doBfs(level + 1, root.left);
        doBfs(level + 1, root.right);
    }


    public List<List<Integer>> levelOrderIterative(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        result = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int count = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < count; i++) {

                TreeNode current = queue.poll();
                level.add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(level);

        }


        return result;
    }


}

