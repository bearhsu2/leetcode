package idv.kuma.easy.single_number;

public class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;
        for (int num : nums) {

            result ^= num;

        }

        return result;

    }
}

