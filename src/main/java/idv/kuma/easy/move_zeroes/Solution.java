package idv.kuma.easy.move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {

        int nextNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            nextNonZeroIndex = Math.max(nextNonZeroIndex, i);

            if (nums[i] == 0) {

                nextNonZeroIndex = findNextNonZeroIndex(nextNonZeroIndex, nums);

                if (nextNonZeroIndex < 0) {
                    return;
                }

                nums[i] = nums[nextNonZeroIndex];
                nums[nextNonZeroIndex] = 0;

            }

        }


    }


    private int findNextNonZeroIndex(int init, int[] nums) {

        for (int i = init; i < nums.length; i++) {
            if (nums[i] != 0) {
                return i;
            }
        }

        return -1;
    }
}
