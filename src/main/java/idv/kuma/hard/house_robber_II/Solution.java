package idv.kuma.hard.house_robber_II;

public class Solution {
    public int rob(int[] nums) {

        int length = nums.length;
        if (length == 0) return 0;
        if (length == 1) return nums[0];


        int[] include0 = new int[length];
        include0[0] = nums[0];
        include0[1] = nums[0];
        for (int i = 2; i < length - 1; i++) {
            include0[i] = Math.max(include0[i - 2] + nums[i], include0[i - 1]);
        }


        int[] exclude0 = new int[length];
        exclude0[0] = 0;
        exclude0[1] = nums[1];

        for (int i = 2; i < length; i++) {
            exclude0[i] = Math.max(exclude0[i - 2] + nums[i], exclude0[i - 1]);
        }

        return Math.max(include0[length - 2], exclude0[length - 1]);

    }
}