package idv.kuma.easy.house_robber;

public class Solution {
    public int rob(int[] nums) {

        int length = nums.length;

        if (length==0) return 0;
        if (length == 1) return nums[0];

        int[] rob = new int[length];

        rob[0] = nums[0];
        rob[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < length; i++) {
            rob[i] = Math.max(rob[i - 2] + nums[i], rob[i - 1]);
        }

        return rob[length - 1];

    }
}
