package idv.kuma.easy.shuffle_an_array;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        Solution solution = new Solution(new int[]{1, 4, 6, 8, 9});

        int[] shuffle = solution.shuffle();

        System.out.println(shuffle);
    }


    @Test
    public void empty() {
        Solution solution = new Solution(new int[]{});

        int[] shuffle = solution.shuffle();

        System.out.println(shuffle);
    }
}