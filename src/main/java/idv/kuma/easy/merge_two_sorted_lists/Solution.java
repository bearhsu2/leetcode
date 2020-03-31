package idv.kuma.easy.merge_two_sorted_lists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l, ListNode r) {

        ListNode dummyHead = new ListNode(-999);
        ListNode iterator = dummyHead;

        while (l != null && r != null) {

            if (l.val < r.val) {
                iterator.next = l;
                l = l.next;

            } else {
                iterator.next = r;
                r = r.next;
            }

            iterator = iterator.next;
        }


        iterator.next = (l == null)
                ? r
                : l;


        return dummyHead.next;
    }

}
