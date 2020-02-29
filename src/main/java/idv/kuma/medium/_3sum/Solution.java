package idv.kuma.medium._3sum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<Integer> handled = new HashSet<>();

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {

            int value = nums[i];
            if (handled.contains(value)) {
                continue;
            }
            handled.add(value);

            int[] subarray = Arrays.copyOfRange(nums, i + 1, nums.length);

            List<List<Integer>> lists = twoSum(subarray, -value);

            for (List<Integer> list : lists) {
                list.add(0, value);
                result.add(list);
            }

        }


        return result;
    }


    private List<List<Integer>> twoSum(int[] nums, int target) {

        Set<Integer> handled = new HashSet<>();

        Map<Integer, Integer> valueToIndex = new HashMap<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int newI = 0; newI < nums.length; newI++) {

            int value = nums[newI];

            Integer existingI = valueToIndex.get(target - value);

            if (Objects.isNull(existingI)) {
                valueToIndex.put(value, newI);
            } else {

                if (!handled.contains(value)) {

                    handled.add(value);

                    List<Integer> list = new ArrayList<>();
                    list.add(target - value);
                    list.add(value);
                    result.add(list);

                }

            }
        }


        return result;
    }
}

