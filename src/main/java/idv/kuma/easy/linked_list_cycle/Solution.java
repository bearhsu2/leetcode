package idv.kuma.easy.linked_list_cycle;


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode current = head;

        Set<ListNode> visited = new HashSet<>();

        while (current != null) {
            if (visited.contains(current)) {
                return true;
            }
            visited.add(current);
            current = current.next;
        }


        return false;
    }
}