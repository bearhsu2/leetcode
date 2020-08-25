package idv.kuma.easy.shuffle_an_array;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Solution {

    private final int[] original;
    private final int[] toBeShuffled;
    Random random = new Random();

    private int length;


    public Solution(int[] nums) {

        this.original = nums;
        this.length = nums.length;
        this.toBeShuffled = new int[length];


    }




    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {

        return original;

    }


    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        for (int i = 0; i < length; i++) {
            toBeShuffled[i] = original[i];
        }

        for (int i = 0; i < length; i++) {

            int randomIndex = random.nextInt(length);

            int temp = toBeShuffled[randomIndex];
            toBeShuffled[randomIndex] = toBeShuffled[i];
            toBeShuffled[i] = temp;

        }



        return toBeShuffled;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */