package idv.kuma.easy.reverse_linked_list;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

//    Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL


    @Test
    public void _1_2_3_4_5() {

        ListNode five = new ListNode(5);
        five.next = null;

        ListNode four = new ListNode(4);
        four.next = five;

        ListNode three = new ListNode(3);
        three.next = four;

        ListNode two = new ListNode(2);
        two.next = three;

        ListNode one = new ListNode(1);
        one.next = two;

        Solution solution = new Solution();
        ListNode actual = solution.reverseList(one);

        List<Integer> values = new ArrayList<>();
        ListNode head = actual;
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        Assertions.assertThat(values).containsExactly(5, 4, 3, 2, 1);


    }
}