package idv.kuma.easy.largest_perimeter_triangle;

import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {

        int[] sorted = Arrays.stream(nums).sorted().toArray();


        for (int i = sorted.length - 1; i >= 2; i--) {

            if (sorted[i] < sorted[i - 1] + sorted[i - 2]) {
                return sorted[i] + sorted[i - 1] + sorted[i - 2];
            }

        }

        return 0;


    }
}