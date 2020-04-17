package idv.kuma.medium.number_of_islands;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name1() {

        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };

        Assertions.assertThat(new Solution().numIslands(grid)).isEqualTo(1);

    }

    @Test
    public void name2() {

        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };

        Assertions.assertThat(new Solution().numIslands(grid)).isEqualTo(3);

    }
}