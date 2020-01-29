package idv.kuma.easy.remove_duplicates_from_sorted_list;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

//    Input: 1->1->2
//    Output: 1->2


    @Test
    public void _1_2_2() {

        ListNode head = getListNode(1, 2, 2);

        new Solution().deleteDuplicates(head);

        Assertions.assertThat(head.allValues()).containsExactly(1, 2);


    }


    private ListNode getListNode(int... values) {

        ListNode node = null;
        ListNode previous = null;

        for (int i = values.length - 1; i >= 0; i--) {
            int value = values[i];

            node = new ListNode(value);
            node.next = previous;

            previous = node;
        }
        return node;
    }


    @Test
    public void _2() {

        ListNode head = getListNode(2);

        new Solution().deleteDuplicates(head);

        Assertions.assertThat(head.allValues()).containsExactly(2);


    }


    @Test
    public void _1_1_2() {

        ListNode head = getListNode(1, 1, 2);

        new Solution().deleteDuplicates(head);

        Assertions.assertThat(head.allValues()).containsExactly(1, 2);


    }
}