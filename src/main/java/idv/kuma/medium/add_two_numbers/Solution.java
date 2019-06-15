package idv.kuma.medium.add_two_numbers;

import java.util.Map;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        boolean done1 = false;
        boolean done2 = false;

        ListNode result = new ListNode(0);
        ListNode pointer = result;
        int beyond = 0;

        ListNode n1 = l1;
        ListNode n2 = l2;

        while (true){

            pointer.val += (done1 ? 0 : n1.val) + (done2? 0 : n2.val);
            if (pointer.val >= 10){
                pointer.val -= 10;
                beyond = 1;
            } else {
                beyond = 0;
            }



            if (!done1){
                if (n1.next == null) {
                    done1 = true;
                } else {
                    n1 = n1.next;
                }
            }

            if (!done2) {
                if (n2.next == null) {
                    done2 = true;
                } else {
                    n2 = n2.next;
                }
            }

            if (done1 && done2 && beyond <= 0){
                break;
            }

            pointer.next = new ListNode(beyond);
            pointer = pointer.next;

        }

        return result;
    }
}