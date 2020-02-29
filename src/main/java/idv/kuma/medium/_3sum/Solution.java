package idv.kuma.medium._3sum;

import java.util.*;

public
class Solution {
    public List<List<Integer>> threeSum(int[] input) {

        int[] nums = deDuplicate(input);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {


            int[] subarray = Arrays.copyOfRange(nums, i + 1, nums.length);

            int current = nums[i];
            List<List<Integer>> lists = twoSum(subarray, -current);

            for (List<Integer> list : lists) {
                list.add(0, current);
                result.add(list);
            }

        }


        return result;
    }


    private int[] deDuplicate(int[] input) {

        return null;
    }


    private List<List<Integer>> twoSum(int[] nums, int target) {

        Map<Integer, Integer> valueToIndex = new HashMap<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int newI = 0; newI < nums.length; newI++) {

            int value = nums[newI];

            Integer existingI = valueToIndex.get(target - value);

            if (Objects.isNull(existingI)) {
                valueToIndex.put(value, newI);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(target - value);
                list.add(value);
                result.add(list);
            }
        }


        return result;
    }
}

