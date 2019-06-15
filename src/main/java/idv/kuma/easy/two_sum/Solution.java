package idv.kuma.easy.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numberIndexMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++){
            int number = nums[i];

            if (numberIndexMap.containsKey(target - number)){
                result[0] = numberIndexMap.get(target - number);
                result[1] = i;
                break;
            } else {
                numberIndexMap.put(number, i);
            }

        }

        return result;
    }
}