package idv.kuma.easy.search_insert_position;

import java.util.stream.IntStream;

public
class Solution {
    public int searchInsert(int[] nums, int target) {

        if (nums.length <= 0) return 0;

        int arrayLength = nums.length;

        return IntStream.rangeClosed(0, arrayLength)
                .filter(index -> nums[index] >= target)
                .findFirst()
                .orElse(nums.length);


    }
}

