package idv.kuma.easy.search_insert_position;

import java.util.stream.IntStream;

public class Solution {
    public int searchInsert(int[] nums, int target) {

        int arrayLength = nums.length;

        if (arrayLength <= 0) return 0;

        return IntStream.range(0, arrayLength)
                .filter(index -> nums[index] >= target)
                .findFirst()
                .orElse(arrayLength);


    }
}

