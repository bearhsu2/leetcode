package idv.kuma.easy.reverse_linked_list;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void _1_2_3_4_5() {

        ListNode actual = createAndRun(1, 2, 3, 4, 5);

        check(actual, 5, 4, 3, 2, 1);


    }


    private ListNode createAndRun(int... vars) {
        return new Solution().reverseList(getListNode(vars));
    }


    private void check(ListNode actual, Integer... vals) {
        List<Integer> values = new ArrayList<>();
        ListNode head = actual;
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        Assertions.assertThat(values).containsExactly(vals);
    }


    private ListNode getListNode(int... vals) {

        ListNode previous = null;
        ListNode current = null;

        for (int i = vals.length - 1; i >= 0; i--) {

            int val = vals[i];

            current = new ListNode(val);
            current.next = previous;

            previous = current;

        }

        return current;
    }
}