package idv.kuma.easy.squares_of_a_sorted_array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _n7_n3_2_3_11() {
//        Input: [-7,-3,2,3,11]
//        Output: [4,9,9,49,121]
        Assertions.assertThat(
                new Solution().sortedSquares(new int[]{-7, -3, 2, 3, 11}))
                .containsExactly(4, 9, 9, 49, 121);
    }


    @Test
    public void _n7_n3_2_3_5_11() {
//        Input: [-7,-3,2,3,5,11]
//        Output: [4,9,9,25,49,121]
        Assertions.assertThat(
                new Solution().sortedSquares(new int[]{-7, -3, 2, 3, 5, 11}))
                .containsExactly(4, 9, 9, 25, 49, 121);
    }


    @Test
    public void _n4_n1_0_3_10() {
//        Input: [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]

        Assertions.assertThat(
                new Solution().sortedSquares(new int[]{-4, -1, -0, 3, 10}))
                .containsExactly(0, 1, 9, 16, 100);
    }
}