package idv.kuma.easy.missing_number;

public class Solution {


    public int missingNumber(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }


        int expectedSum = (nums.length) * (nums.length + 1) / 2;


        return expectedSum - sum;
    }
}
