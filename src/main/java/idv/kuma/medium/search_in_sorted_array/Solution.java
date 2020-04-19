package idv.kuma.medium.search_in_sorted_array;

import java.util.Arrays;

public class Solution {
    // array
    // binary search


    public int search(int[] nums, int target) {

        int length = nums.length;
        int indexOfMin = findIndexOfMin(nums);

        int[] right = Arrays.copyOfRange(nums, indexOfMin, length);
        int[] left = Arrays.copyOfRange(nums, 0, indexOfMin);

        return -1;
    }


    private int findIndexOfMin(int[] nums) {
        int length = nums.length;

        if (length == 1) return 0;

        int left = 0;
        int right = length - 1;

        // already sorted
        if (nums[right] > nums[0]) {
            return 0;
        }

        while (left <= right) {

            int middle = (left + right) / 2;

            if (nums[middle] > nums[middle + 1]) {
                return middle + 1;
            }
            if (nums[middle] < nums[middle - 1]) {
                return middle;
            }


            if (nums[middle] > nums[0]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }


        return -1;
    }


    private int binarySearch(int[] nums, int target) {
        int length = nums.length;

        if (length == 0) return -1;

        int left = 0;
        int right = length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (nums[middle] == target) {
                return middle;
            }


            if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }


        return -1;
    }
}
