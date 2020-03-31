package idv.kuma.easy.two_sum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> valueToIndex = new HashMap<>();

        int[] result = new int[]{-1, -1};

        for (int newI = 0; newI < nums.length; newI++) {

            int value = nums[newI];

            Integer existingI = valueToIndex.get(target - value);

            if (Objects.isNull(existingI)) {
                valueToIndex.put(value, newI);
            } else {
                result[0] = existingI;
                result[1] = newI;
                break;
            }
        }


        return result;
    }
}