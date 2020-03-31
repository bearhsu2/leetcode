package idv.kuma.easy.remove_duplicates_from_sorted_list;


import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;


    ListNode(int x) {
        val = x;
    }


    List<Integer> allValues() {

        List<Integer> result = new ArrayList<>();

        ListNode iterator = this;

        while (iterator != null) {

            result.add(iterator.val);

            iterator = iterator.next;
        }


        return result;

    }
}
