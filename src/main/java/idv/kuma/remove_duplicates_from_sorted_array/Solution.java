package idv.kuma.remove_duplicates_from_sorted_array;


class Solution {
    public int removeDuplicates(int[] nums) {


        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;


        int targetLength = nums.length;
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; ) {

            if (nums[i] < currentMax)  break;

            int nextValue = nums[i];

            if (currentMax == nextValue) {

                // move this item to the tail
                for (int j = i; j < nums.length - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                targetLength--;

                if (nums[i] > currentMax) {
                    currentMax = nums[i];
                    i++;
                }
            }

        }


        return targetLength;

    }
}