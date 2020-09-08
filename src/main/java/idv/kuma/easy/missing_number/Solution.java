package idv.kuma.easy.missing_number;

import java.util.stream.IntStream;

public class Solution {


    public int missingNumber(int[] nums) {

        int sum = 

        int actualSum = IntStream.of(nums).sum();


        int expectedSum = (nums.length) * (nums.length + 1) / 2;


        return expectedSum - actualSum;
    }
}
