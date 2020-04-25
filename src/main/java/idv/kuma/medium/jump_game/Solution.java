package idv.kuma.medium.jump_game;

public class Solution {
    public boolean canJump(int[] nums) {


        int maxIndex = nums.length - 1;

        int globalFarthest = 0;

        for (int i = 0; i <= maxIndex; i++) {

            if (globalFarthest < i) {
                return false;
            }

            int localFarthest = i + nums[i];

            if (localFarthest > globalFarthest) {
                globalFarthest = localFarthest;
            }

            if (globalFarthest >= maxIndex) {
                return true;
            }

        }

        return false;
    }
}
