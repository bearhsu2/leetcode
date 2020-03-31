package idv.kuma.easy.search_insert_position;

public class Solution {
    public int searchInsert(int[] nums, int target) {

        int arrayLength = nums.length;

        if (arrayLength <= 0) return 0;


        int low = 0;
        int high = arrayLength - 1;

        while (low <= high) {


            int middle = (low + high) / 2;

            int middleValue = nums[middle];
            if (middleValue == target) {
                return middle;
            }

            if (middleValue < target) {
                low = middle + 1;
            } else { // middleValue > target
                high = middle - 1;
            }


        }

        return low;

    }
}

