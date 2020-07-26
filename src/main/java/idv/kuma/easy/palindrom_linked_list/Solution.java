package idv.kuma.easy.palindrom_linked_list;

public class Solution {
    public boolean isPalindrome(ListNode head) {


        int right = 0;
        int left = 0;

        int base = 1;

        ListNode current = head;
        while (current != null) {

            right = right * 10 + current.val;

            left = current.val * base + left;


            current = current.next;
            base *= 10;

        }

        return right == left;
    }
}
