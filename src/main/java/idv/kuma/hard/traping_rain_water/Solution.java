package idv.kuma.hard.traping_rain_water;

public class Solution {


    public int trap(int[] heights) {

        int volume = 0;


        // search left to right
        int left = 0;

        while (true) {
            int nextTaller = findNextTallerFromLeft(heights, left);
            if (nextTaller < 0) {
                break;
            }
            volume += calculateWaterFromLeft(heights, left, nextTaller);
            left = nextTaller;
        }

        // search right to left
        int right = heights.length - 1;


        while (true) {
            int nextTaller = findNextTallerFromRight(heights, right, left);

            if (nextTaller < 0) {
                break;
            }

            volume += calculateWaterFromRight(heights, right, nextTaller);
            right = nextTaller;
        }

        return volume;

    }

    private int calculateWaterFromRight(int[] heights, int right, int nextTaller) {

        int volume = 0;

        for (int i = right - 1; i > nextTaller; i--) {
            volume += heights[right] - heights[i];
        }

        return volume;

    }

    private int findNextTallerFromRight(int[] heights, int right, int left) {

        for (int i = right - 1; i >= 0 && i >= left; i--) {
            if (heights[i] >= heights[right]) {
                return i;
            }
        }

        // cannot find taller
        return -1;
    }

    private int calculateWaterFromLeft(int[] heights, int left, int nextTaller) {
        int volume = 0;

        for (int i = left + 1; i < nextTaller; i++) {
            volume += heights[left] - heights[i];
        }

        return volume;
    }

    private int findNextTallerFromLeft(int[] heights, int left) {

        for (int i = left + 1; i < heights.length; i++) {
            if (heights[i] >= heights[left]) {
                return i;
            }
        }

        // cannot find taller
        return -1;
    }
}