package idv.kuma.hard.merge_k_sorted_lists;


import java.util.*;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {



        List<ListNode> listNodes = Arrays.asList(lists);

        ListNode head = new ListNode(-999);
        ListNode current = head;

        Set<ListNode> finishedNodes = new HashSet<>();

        while (true) {
            Optional<ListNode> minNodeOpt = listNodes.parallelStream()
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
