package idv.kuma.easy.remove_linked_list_elements;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

//    Input:  1->2->6->3->4->5->6, val = 6
//    Output: 1->2->3->4->5


    @Test
    public void _1_2_6_3_4_5_6_val_6() {


        ListNode listNode = makeNodes(1, 2, 6, 3, 4, 5, 6);

        Solution solution = new Solution();
        ListNode actual = solution.removeElements(listNode, 6);


        check(actual, 1, 2, 3, 4, 5);


    }


    private ListNode makeNodes(Integer... values) {

        ListNode previous = null;
        ListNode node = null;
        for (int i = values.length - 1; i >= 0; i--) {
            Integer value = values[i];

            node = new ListNode(value);
            node.next = previous;

            previous = node;
        }

        return node;

    }


    private void check(ListNode actual, Integer... values) {

        int i = 0;
        while (actual != null) {
            Assert.assertEquals("index = " + i, values[i].intValue(), actual.val);

            actual = actual.next;
            i++;
        }


    }
}