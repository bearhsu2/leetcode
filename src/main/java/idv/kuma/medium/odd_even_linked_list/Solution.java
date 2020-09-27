package idv.kuma.medium.odd_even_linked_list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        ListNode oddHead = head;
        ListNode oddCurrent = oddHead;


        ListNode evenHead = head.next;
        ListNode evenCurrent = evenHead;

        while (evenCurrent != null && evenCurrent.next != null) {
            oddCurrent.next = oddCurrent.next.next;
            oddCurrent = oddCurrent.next;

            evenCurrent.next = evenCurrent.next.next;
            evenCurrent = evenCurrent.next;


        }

        oddCurrent.next = evenHead;


        return oddHead;
    }
}

