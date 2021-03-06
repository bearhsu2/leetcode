package idv.kuma.medium.binary_tree_zigzag_level_order_traversal;

import idv.kuma.common.TreeNode;

import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<List<Integer>> result;

   


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

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

        List<Integer> list = result.get(level);


        list.add(getIndex(level, list), root.val);

        doBfs(level + 1, root.left);
        doBfs(level + 1, root.right);
    }


    private int getIndex(int level, List<Integer> list) {
        return level % 2 == 0 ? list.size() : 0;
    }

}
