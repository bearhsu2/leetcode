package idv.kuma.medium.maximum_difference_between_node_and_ancestor;

public class Solution {

    int maxDiff = Integer.MIN_VALUE;


    int maxAncestorDiff(TreeNode root) {
        doTraverse(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
        return maxDiff;
    }


    private void doTraverse(TreeNode node, int parentMin, int parentMax) {

        if (node == null) {
            return;
        }

        int newMin = Math.min(node.val, parentMin);
        int newMax = Math.max(node.val, parentMax);
        int diff = Math.abs(newMin - newMax);

        maxDiff = Math.max(maxDiff, diff);

        doTraverse(node.left, newMin, newMax);
        doTraverse(node.right, newMin, newMax);

    }

}