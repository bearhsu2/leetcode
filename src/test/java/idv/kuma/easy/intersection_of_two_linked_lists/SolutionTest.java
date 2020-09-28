package idv.kuma.easy.intersection_of_two_linked_lists;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _4_1_And_5_6_1_Then_Null() {

        ListNode listA = makeList(4, 1);
        ListNode listB = makeList(5, 6, 1);


        ListNode actual = new Solution().getIntersectionNode(listA, listB);

        Assert.assertEquals(actual, null);


    }


    private ListNode makeList(int... values) {

        ListNode dummyHead = new ListNode(-999);
        ListNode current = dummyHead;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummyHead.next;

    }


    @Test
    public void _4_1_8_4_5_And_5_6_1_8_4_5_Then_8() {

        ListNode listA = makeList(4, 1);
        ListNode listB = makeList(5, 6, 1);
        ListNode common = makeList(8, 4, 5);

        concat(listA, common);
        concat(listB, common);

        ListNode actual = new Solution().getIntersectionNode(listA, listB);

        Assert.assertEquals(actual, common);


    }


    private void concat(ListNode list, ListNode another) {

        ListNode current = list;

        while (current.next != null) {
            current = current.next;
        }

        current.next = another;

    }
}