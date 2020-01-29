package idv.kuma.easy.remove_duplicates_from_sorted_list;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

//    Input: 1->1->2
//    Output: 1->2


    @Test
    public void _1_2_2() {

        ListNode head = getListNode(1, 2, 2);

        new Solution().deleteDuplicates(head);

        Assertions.assertThat(allValues(head)).containsExactly(1, 2);


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


    private List<Integer> allValues(ListNode head) {

        List<Integer> result = new ArrayList<>();

        ListNode iterator = head;

        while (iterator != null) {

            result.add(iterator.val);

            iterator = iterator.next;
        }


        return result;

    }


    @Test
    public void _2() {

        ListNode head = getListNode(2);

        new Solution().deleteDuplicates(head);

        Assertions.assertThat(allValues(head)).containsExactly(2);


    }


    @Test
    public void _1_1_2() {

        ListNode head = getListNode(1, 1, 2);

        new Solution().deleteDuplicates(head);

        Assertions.assertThat(allValues(head)).containsExactly(1, 2);


    }
}