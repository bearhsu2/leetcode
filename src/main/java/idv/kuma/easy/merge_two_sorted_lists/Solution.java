package idv.kuma.easy.merge_two_sorted_lists;

import java.util.*;

public class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {

        List<ListNode> listNodes = Arrays.asList(a, b);

        ListNode head = new ListNode(-999);
        ListNode current = head;

        Set<ListNode> finishedNodes = new HashSet<>();

        while (true) {
            Optional<ListNode> minNodeOpt = listNodes.stream()
                    .filter(l -> l != null && !finishedNodes.contains(l))
                    .min(Comparator.comparingInt(l -> l.val));

            if (!minNodeOpt.isPresent()) break;

            ListNode minNode = minNodeOpt.get();

            ListNode newNode = new ListNode(minNode.val);
            current.next = newNode;
            current = current.next;

            ListNode next = minNode.next;

            if (null == next) {
                finishedNodes.add(minNode);
            } else {
                minNode.val = next.val;
                minNode.next = next.next;
            }
        }

        return head.next;
    }

}
