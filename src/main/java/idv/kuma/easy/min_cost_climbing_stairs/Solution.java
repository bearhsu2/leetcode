package idv.kuma.easy.min_cost_climbing_stairs;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int length = cost.length;
        int[] min = new int[length];

        min[0] = cost[0];
        min[1] = cost[1];

        for (int i = 2; i < length; i++) {

            min[i] = cost[i] + Math.min(min[i - 1], min[i - 2]);
        }


        return Math.min(min[length - 1], min[length - 2]);
    }
}