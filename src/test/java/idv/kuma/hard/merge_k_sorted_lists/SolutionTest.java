package idv.kuma.hard.merge_k_sorted_lists;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void When_0_V_Empty_Then_0() {

        Solution solution = new Solution();

        ListNode l1 = createListNode(0);
        ListNode l2 = createListNode();


        ListNode listNode = solution.mergeKLists(new ListNode[]{l1, l2});

        traceAndCheck(Arrays.asList(0), listNode);


    }

    @Test
    public void When_0_1_V_0_1_Then_0_0_1_1() {

        Solution solution = new Solution();

        ListNode l1 = createListNode(0, 1);
        ListNode l2 = createListNode(0, 1);


        ListNode listNode = solution.mergeKLists(new ListNode[]{l1, l2});

        traceAndCheck(Arrays.asList(0, 0, 1, 1), listNode);


    }

    private ListNode createListNode(int... values) {
        ListNode head = null;
        ListNode current = null;

        for (int value : values) {
            if (head == null) {
                ListNode newNode = new ListNode(value);
                head = newNode;
                current = head;
            } else {
                ListNode newNode = new ListNode(value);
                current.next = newNode;
                current = current.next;
            }
        }

        return head;
    }

    private void traceAndCheck(List<Integer> expectedValues, ListNode listNode) {

        List<Integer> actualValues = new ArrayList<>();


        ListNode head = listNode;
        while (head != null) {
            actualValues.add(head.val);
            head = head.next;
        }

        Assertions.assertThat(actualValues).hasSameElementsAs(expectedValues);

    }
}