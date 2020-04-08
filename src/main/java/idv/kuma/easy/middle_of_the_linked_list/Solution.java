package idv.kuma.easy.middle_of_the_linked_list;


import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode middleNode(ListNode head) {

        List<ListNode> nodes = new ArrayList<>();

        ListNode pointer = head;
        while (pointer != null) {
            nodes.add(pointer);
            pointer = pointer.next;
        }

        return nodes.get(nodes.size() / 2);
    }
}