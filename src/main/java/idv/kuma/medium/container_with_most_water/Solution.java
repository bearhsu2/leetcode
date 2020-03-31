package idv.kuma.medium.container_with_most_water;

public class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length - 1;

        int area = 0;
        while (left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];

            area = Math.max(
                    area,
                    Math.min(rightHeight, leftHeight) * (right - left)
            );

            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }

        }


        return area;
    }
}