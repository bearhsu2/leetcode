package idv.kuma.easy.middle_of_the_linked_list;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _1_2_3_4_5_Then_3() {

        ListNode head = createNodes(1, 2, 3, 4, 5);

        ListNode result = new Solution().middleNode(head);

        Assertions.assertThat(result.val).isEqualTo(3);

    }

    @Test
    public void _1_2_3_4_5_6_Then_4() {

        ListNode head = createNodes(1, 2, 3, 4, 5,6);

        ListNode result = new Solution().middleNode(head);

        Assertions.assertThat(result.val).isEqualTo(4);

    }


    private ListNode createNodes(int... values) {

        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        ListNode pointer = dummyHead;

        for (int value : values) {
            ListNode newNode = new ListNode(value);
            pointer.next = newNode;
            pointer = pointer.next;
        }

        return dummyHead.next;
    }
}