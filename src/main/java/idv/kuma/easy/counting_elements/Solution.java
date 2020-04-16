package idv.kuma.easy.counting_elements;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countElements(int[] arr) {

        Set<Integer> elements = new HashSet<>();

        for (int e : arr) {
            elements.add(e);
        }

        int count = 0;
        for (int e : arr) {
            if (elements.contains(e + 1)) {
                count++;
            }
        }

        return count;
    }
}
