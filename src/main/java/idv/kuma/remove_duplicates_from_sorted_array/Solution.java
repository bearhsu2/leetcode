package idv.kuma.remove_duplicates_from_sorted_array;


class Solution {
    public int removeDuplicates(int[] nums) {


        if (nums.length == 1) return 1;


        int targetLength = nums.length;
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int nextValue = nums[i];

            if (currentMax == nextValue) {

                // move this item to the tail
                for (int j = i; j < nums.length - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                targetLength--;
            }
            currentMax = nums[i];
        }


        return targetLength;

    }
}