package idv.kuma.easy.palindrom_linked_list;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _1_2_3_False() {

        ListNode head = new ListNode(1);
        ListNode current = head;

        current.next = new ListNode(2);
        current = current.next;
        current.next = new ListNode(3);
        current = current.next;

        Assert.assertFalse(new Solution().isPalindrome(head));


    }
    @Test
    public void _1_2_2_1_True() {

        ListNode head = new ListNode(1);
        ListNode current = head;

        current.next = new ListNode(2);
        current = current.next;
        current.next = new ListNode(2);
        current = current.next;
        current.next = new ListNode(1);
        current = current.next;

        Assert.assertTrue(new Solution().isPalindrome(head));


    }
}