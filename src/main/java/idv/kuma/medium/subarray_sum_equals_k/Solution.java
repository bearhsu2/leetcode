package idv.kuma.medium.subarray_sum_equals_k;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int subarraySum(int[] nums, int target) {

        int sum = 0;

        Map<Integer, Integer> sumToFrequency = new HashMap<>();
        sumToFrequency.put(0, 1);

        int counter = 0;

        for (int num : nums) {
            sum += num;

            int diff = sum - target;
            if (sumToFrequency.containsKey(diff)) {
                counter += sumToFrequency.get(diff);
            }

            sumToFrequency.put(sum, sumToFrequency.getOrDefault(sum, 0) + 1);

        }

        return counter;
    }
}
