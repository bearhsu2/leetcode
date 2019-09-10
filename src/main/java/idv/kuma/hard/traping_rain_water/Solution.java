package idv.kuma.hard.traping_rain_water;

public class Solution {


    public int trap(int[] heights) {

        if (heights.length<=0) {
            return 0;
        }

        int volume = 0;

        int tallest = findTallest(heights);

        // search from 0 to tallest
        int left = 0;
        while (left < tallest) {
            int nextTaller = findNextTallerFromLeft(heights, left, tallest);
            volume += calculateWaterFromLeft(heights, left, nextTaller);
            left = nextTaller;
        }

        // search last to tallest
        int right = heights.length - 1;
        while (right > tallest) {
            int nextTaller = findNextTallerFromRight(heights, right, tallest);
            volume += calculateWaterFromRight(heights, right, nextTaller);
            right = nextTaller;
        }

        return volume;

    }

    private int findTallest(int[] heights) {

        int max = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;

        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];

            if (height > max) {
                index = i;
                max = height;
            }
        }

        return index;
    }

    private int calculateWaterFromRight(int[] heights, int right, int nextTaller) {

        int volume = 0;

        for (int i = right - 1; i > nextTaller; i--) {
            volume += heights[right] - heights[i];
        }

        return volume;

    }

    private int findNextTallerFromRight(int[] heights, int right, int tallest) {

        for (int i = right - 1; i >= 0 && i >= tallest; i--) {
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

    private int findNextTallerFromLeft(int[] heights, int left, int tallest) {

        for (int i = left + 1; i < heights.length && i <= tallest; i++) {
            if (heights[i] >= heights[left]) {
                return i;
            }
        }

        // cannot find taller
        return -1;
    }
}