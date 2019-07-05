package idv.kuma.hard.merge_k_sorted_lists;


import java.util.Arrays;
import java.util.List;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length <= 0) return null;

        List<ListNode> listNodes = Arrays.asList(lists);


        ListNode reduce = listNodes.stream()
                .filter(l -> l != null)
                .reduce((a, b) -> mergeTwoLists(a, b))
                .orElse(null);

        return reduce;
    }


    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode next1 = l1;
        ListNode next2 = l2;

        ListNode head = new ListNode(-999);
        ListNode current = head;

        while (true) {

            if (next1 != null && next2 != null) {

                int val1 = next1.val;
                int val2 = next2.val;

                if (val1 < val2) {
                    ListNode newNode = new ListNode(val1);

                    current.next = newNode;
                    current = current.next;

                    next1 = next1.next;
                } else {

                    ListNode newNode = new ListNode(val2);

                    current.next = newNode;
                    current = current.next;

                    next2 = next2.next;

                }


            } else if (next1 == null && next2 != null) {

                int val2 = next2.val;
                ListNode newNode = new ListNode(val2);

                current.next = newNode;
                current = current.next;

                next2 = next2.next;

            } else if (next1 != null && next2 == null) {

                int val1 = next1.val;
                ListNode newNode = new ListNode(val1);

                current.next = newNode;
                current = current.next;

                next1 = next1.next;


            } else {
                break;
            }

        }


        return head.next;
    }

}
