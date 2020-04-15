package idv.kuma.medium.product_of_array_except_self;

public class Solution {
    // Array, DP
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int maxIndex = length - 1;

        int[] L = new int[length];
        int[] R = new int[length];

        for (int i = 0; i < length; i++) {
            L[i] = i == 0 ? 1 : L[i - 1] * nums[i - 1];

            int j = maxIndex - i;
            R[j] = j == maxIndex ? 1 : R[j + 1] * nums[j + 1];
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = L[i] * R[i];
        }

        return result;
    }
}
