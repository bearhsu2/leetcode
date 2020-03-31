package idv.kuma.easy.remove_duplicates_from_sorted_list;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode iterator = head;
        while (iterator != null){

            ListNode nextNode = iterator.next;

            if (nextNode == null) {
                break;
            }

            while (nextNode != null && nextNode.val == iterator.val) {
                nextNode = nextNode.next;
            }


            iterator.next = nextNode;
            iterator = nextNode;
        }

        return head;

    }
}