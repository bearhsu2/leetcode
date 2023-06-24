package idv.kuma.easy.majority_element;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {

        int half = nums.length / 2;
        Map<Integer, Integer> elementToCount = new HashMap<>();

        for (int num : nums) {

            Integer count = elementToCount.get(num);

            if (count == null) {
                count = 0;
            }

            count++;

            if (count > half) {
                return num;
            }

            elementToCount.put(num, count);

        }

        throw new RuntimeException("should not run this line");

    }
}