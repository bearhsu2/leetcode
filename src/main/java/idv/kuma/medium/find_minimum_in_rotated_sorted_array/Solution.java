package idv.kuma.medium.find_minimum_in_rotated_sorted_array;

public class Solution {
    // array
    // binary search

    public int findMin(int[] nums) {

        int length = nums.length;



        if (length == 1) return nums[0];

        int left = 0;
        int right = length - 1;

        // already sorted
        if (nums[right] > nums[0]) {
            return nums[0];
        }

        while (left <= right) {

            int middle = (left + right) / 2;

            if (nums[middle] > nums[middle + 1]) {
                return nums[middle + 1];
            }
            if (nums[middle] < nums[middle - 1]) {
                return nums[middle];
            }


            if (nums[middle] > nums[0]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }


        return -1;
    }
}