package idv.kuma.easy.find_the_town_judge;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void case_1() {
        runAndCheck(2, new int[][]{{1, 2}}, 2);
    }


    private void runAndCheck(int N, int[][] trusts, int expected) {
        Assertions.assertThat(
                new Solution().findJudge(N, trusts)
        ).isEqualTo(expected);
    }


    @Test
    public void case_2() {
        runAndCheck(3, new int[][]{{1, 3}, {2, 3}}, 3);
    }


    @Test
    public void case_3() {
        runAndCheck(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}, -1);
    }


    @Test
    public void case_4() {
        runAndCheck(3, new int[][]{{1, 2}, {2, 3}}, -1);
    }


    @Test
    public void case_5() {
        runAndCheck(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}, 3);
    }
}