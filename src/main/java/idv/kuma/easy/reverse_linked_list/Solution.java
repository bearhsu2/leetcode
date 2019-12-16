package idv.kuma.easy.reverse_linked_list;

public class Solution {

    public ListNode reverseList(ListNode head) {


        ListNode previous = null;

        ListNode current = null;
        while (head != null) {

            current = new ListNode(head.val);
            current.next = previous;

            head = head.next;
            previous = current;
        }


        return current;

    }
}
