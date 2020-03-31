package idv.kuma.medium.remove_the_nth_node_from_end_of_list;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode veryHead = new ListNode(-1);
        veryHead.next = head;


        ListNode front = veryHead;
        ListNode rear = veryHead;

        for (int i = 0; i < n; i++){
            front = front.next;
        }

        while (front.next != null) {
            front = front.next;
            rear = rear.next;
        }

        rear.next = rear.next.next;

        return veryHead.next;
    }


}