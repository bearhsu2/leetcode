package idv.kuma.easy.intersection_of_two_linked_lists;


public class Solution {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        return null;
    }



    private ListNode reverseList(ListNode head) {


        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }
}

