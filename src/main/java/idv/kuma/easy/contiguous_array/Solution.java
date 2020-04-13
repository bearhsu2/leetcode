package idv.kuma.easy.contiguous_array;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findMaxLength(int[] nums) {

        Map<Integer, Integer> countToFirstIndex = new HashMap<>();

        int maxLength = 0;
        int count = 0;
        countToFirstIndex.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            count += num == 0
                    ? -1
                    : 1;

            Integer firstIndex = countToFirstIndex.get(count);

            if (firstIndex == null) {
                countToFirstIndex.put(count, i);
            } else {
                maxLength = Math.max(maxLength, i - firstIndex);
            }

        }

        return maxLength;

    }
}
