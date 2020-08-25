package idv.kuma.easy.shuffle_an_array;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Solution {

    private final int[] original;
    private final List<Integer> list;
    Random random = new Random();
    private int length;


    public Solution(int[] nums) {

        this.original = nums;
        this.length = nums.length;
        this.list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

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

        int[] shuffled = new int[length];

        int remains = length;
        for (int i = 0; i < length; i++) {

            int randomIndex = random.nextInt(remains);
            shuffled[i] = list.get(randomIndex);
            list.remove(randomIndex);
            remains--;

        }


        return shuffled;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */