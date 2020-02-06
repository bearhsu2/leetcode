package idv.kuma.medium.unique_paths_II;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {

        Assert.assertEquals(2, new Solution().uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }));
    }
}