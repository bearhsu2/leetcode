package idv.kuma.easy.remove_nth_node_from_end_of_list;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode(9999);
        dummyHead.next=head;

        ListNode forward = dummyHead;
        ListNode guard = dummyHead;

        for (int i = 0; i < n; i++) {
            forward = forward.next;
        }

        while (forward.next != null) {
            forward = forward.next;
            guard = guard.next;
        }

        guard.next = guard.next.next;

        return dummyHead.next;
    }
}
