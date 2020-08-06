package idv.kuma.easy.linked_list_cycle;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _3_2_0_n4_pos1() {

        ListNode head = new ListNode(3);
        ListNode current = head;


        ListNode newNode = new ListNode(2);
        ListNode joint = newNode;
        current.next = newNode;
        current = current.next;

        newNode = new ListNode(0);
        current.next = newNode;
        current = current.next;

        newNode = new ListNode(-4);
        current.next = newNode;
        current = current.next;

        current.next = joint;


        Assert.assertTrue(new Solution().hasCycle(head));
    }
}