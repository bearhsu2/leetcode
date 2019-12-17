package idv.kuma.easy.remove_linked_list_elements;

class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-9999);
        ListNode current = dummyHead;

        while (head != null) {

            if (head.val != val) {
                current.next = new ListNode(head.val);
                current = current.next;
            }

            head = head.next;
        }

        return dummyHead.next;

    }
}
