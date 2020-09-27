package idv.kuma.medium.odd_even_linked_list;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void _1_2_3__1_3_2() {

        ListNode head = makeList(1, 2, 3);

        ListNode actual = new Solution().oddEvenList(head);

        Assertions.assertThat(goThrough(actual)).containsExactly(1, 3, 2);


    }


    @Test
    public void _1_2_3_4__1_3_2_4() {

        ListNode head = makeList(1, 2, 3, 4);

        ListNode actual = new Solution().oddEvenList(head);

        Assertions.assertThat(goThrough(actual)).containsExactly(1, 3, 2, 4);


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


    private List<Integer> goThrough(ListNode head) {
        List<Integer> result = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }

        return result;
    }


}