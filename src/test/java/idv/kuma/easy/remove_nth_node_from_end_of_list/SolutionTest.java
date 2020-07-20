package idv.kuma.easy.remove_nth_node_from_end_of_list;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
//        1->2->3->4->5, and n = 2.


        ListNode head = new ListNode(1);
        ListNode pointer = head;

        pointer.next = new ListNode(2);
        pointer = pointer.next;

        pointer.next = new ListNode(3);
        pointer = pointer.next;

        pointer.next = new ListNode(4);
        pointer = pointer.next;

        pointer.next = new ListNode(5);
        pointer = pointer.next;

        ListNode actual = new Solution().removeNthFromEnd(head, 2);

        System.out.println();
    }
}


