package idv.kuma.easy.maximum_subarray;

public class Solution {
    public int maxSubArray(int[] nums) {

        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;

        for (int num : nums) {
            localMax = Math.max(localMax + num, num);
            globalMax = Math.max(globalMax, localMax);
        }

        return globalMax;
    }
}
