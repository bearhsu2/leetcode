package idv.kuma.easy.rotate_array;

public class Solution {
    public void rotate(int[] nums, int k) {

        for (int i = 0; i < k; i++) {
            doRotate(nums);
        }

    }


    private void doRotate(int[] nums) {

        int template = nums[0];

        int length = nums.length;
        for (int i = length - 1; i >= 0; i--) {
            nums[(i + 1) % length] = nums[i];
        }

        nums[1] = template;

    }
}