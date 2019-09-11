package idv.kuma.medium.permutations;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void _1() {

        System.out.println(createAndRun(new int[]{1}));
    }


    @Test
    public void _1_2_3() {

        System.out.println(createAndRun(new int[]{1, 2, 3}));
    }

    private List<List<Integer>> createAndRun(int[] nums) {
        Solution solution = new Solution();

        return solution.permute(nums);
    }
}