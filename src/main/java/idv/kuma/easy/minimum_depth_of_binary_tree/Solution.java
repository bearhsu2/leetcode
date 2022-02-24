package idv.kuma.easy.minimum_depth_of_binary_tree;

import idv.kuma.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Deque<TreeNodeWithDepth> queue = new ArrayDeque<>();

        queue.addLast(new TreeNodeWithDepth(root, 1));


        while (!queue.isEmpty()) {

            TreeNodeWithDepth nodeWithDepth = queue.removeFirst();

            TreeNode node = nodeWithDepth.getTreeNode();
            int depth = nodeWithDepth.getDepth();

            if (node.left == null && node.right == null) {
                return depth;
            }

            if (node.left != null) {
                queue.addLast(
                        new TreeNodeWithDepth(node.left, depth + 1)
                );
            }

            if (node.right != null) {
                queue.addLast(
                        new TreeNodeWithDepth(node.right, depth + 1)
                );
            }

        }

        return 0;
    }


    public static class TreeNodeWithDepth {

        TreeNode treeNode;
        int depth;


        public TreeNodeWithDepth(TreeNode treeNode, int depth) {
            this.treeNode = treeNode;
            this.depth = depth;
        }


        public TreeNode getTreeNode() {
            return treeNode;
        }


        public void setTreeNode(TreeNode treeNode) {
            this.treeNode = treeNode;
        }


        public int getDepth() {
            return depth;
        }


        public void setDepth(int depth) {
            this.depth = depth;
        }
    }
}
