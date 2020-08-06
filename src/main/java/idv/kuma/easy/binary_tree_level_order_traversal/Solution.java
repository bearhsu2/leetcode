package idv.kuma.easy.binary_tree_level_order_traversal;


import idv.kuma.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {



        if (root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> list = new ArrayList<>();
        traverse(root, 0, list);

        return list;


    }

    private void traverse(TreeNode node, int nodeLevel, List<List<Integer>> stack){
        if (stack.size() <= nodeLevel){
            while (stack.size() <= nodeLevel) {
                stack.add(new ArrayList<Integer>());
            }
        }

        stack.get(nodeLevel).add(node.val);


        if (node.left != null) {
            traverse(node.left, nodeLevel + 1, stack);
        }

        if (node.right != null) {
            traverse(node.right, nodeLevel + 1, stack);
        }
    }

}