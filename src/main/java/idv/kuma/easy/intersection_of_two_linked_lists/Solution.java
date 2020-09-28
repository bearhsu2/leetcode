package idv.kuma.easy.intersection_of_two_linked_lists;


public class Solution {



    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode currentA = headA;
        ListNode currentB = headB;

        // When currentA == currentB, there may be two situations:
        // 1) A and B comes to a null simultaneously => no interaction
        // 2) A and B comes to the same point => this is THE interaction
        while (currentA != currentB) {

            if (currentA == null) {
                currentA = headB;
            } else {
                currentA = currentA.next;
            }

            if (currentB == null) {
                currentB = headA;
            } else {
                currentB = currentB.next;
            }


        }


        return currentA;
    }


}

