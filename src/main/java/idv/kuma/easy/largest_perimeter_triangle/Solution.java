package idv.kuma.easy.largest_perimeter_triangle;

import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {

//        int[] sorted = Arrays.stream(nums).sorted().toArray();

        Arrays.sort(nums);


        for (int i = nums.length - 1; i >= 2; i--) {

            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }

        }

        return 0;


    }
}