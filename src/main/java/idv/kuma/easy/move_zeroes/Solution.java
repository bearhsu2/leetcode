package idv.kuma.easy.move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {

        int nextNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] !=0) {
                swap(nums, nextNonZeroIndex, i);
                nextNonZeroIndex++;
            }
        }

    }


    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index2];
        nums[index2] = nums[index1];
        nums[index1] = temp;
    }

}
