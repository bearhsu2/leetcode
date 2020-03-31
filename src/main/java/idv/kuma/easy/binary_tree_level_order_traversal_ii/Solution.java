package idv.kuma.easy.binary_tree_level_order_traversal_ii;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Stack<List<Integer>> stack = new Stack<>();

        if (root == null){
            return new ArrayList<>();
        }

        traverse(root, 0, stack);

        List<List<Integer>> list = new ArrayList<>();
        while (stack.size() > 0){
            list.add(stack.pop());
        }

        return list;


    }

    private void traverse(TreeNode node, int nodeLevel, Stack<List<Integer>> stack){
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