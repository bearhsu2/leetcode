package idv.kuma.medium.maximum_difference_between_node_and_ancestor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    Map<TreeNode, Integer> nodeToMin = new HashMap<>();
    Map<TreeNode, Integer> nodeToMax = new HashMap<>();

    List<TreeNode> nodes = new ArrayList<>();

    int maxDiff = Integer.MIN_VALUE;


    int maxAncestorDiff(TreeNode root) {

        doTraverse(root, Integer.MAX_VALUE, Integer.MIN_VALUE);

        return maxDiff;
    }


    private void doTraverse(TreeNode node, int parentMin, int parentMax) {

        if (node == null) {
            return;
        }

        System.out.println("=====================");
        System.out.println(node.val);

        int newMin = Math.min(node.val, parentMin);
        int newMax = Math.max(node.val, parentMax);

        int diff = Math.abs(newMin - newMax);

        System.out.println("min: " + parentMin + " => " + newMin);
        System.out.println("max: " + parentMax + " => " + newMax);

        System.out.println("maxDiff: " + maxDiff);
        maxDiff = Math.max(maxDiff, diff);

        System.out.println("            => " + maxDiff);


        doTraverse(node.left, newMin, newMax);
        doTraverse(node.right, newMin, newMax);

    }

}