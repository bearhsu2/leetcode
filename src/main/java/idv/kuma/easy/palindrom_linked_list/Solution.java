package idv.kuma.easy.palindrom_linked_list;

public class Solution {
    public boolean isPalindrome(ListNode head) {


        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        ListNode current = head;
        while (current != null) {

            left.insert(0, current.val);

            right.append(current.val);

            current = current.next;

        }

        return right.toString().equals(left.toString());
    }
}
