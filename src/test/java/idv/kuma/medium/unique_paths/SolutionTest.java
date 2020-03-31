package idv.kuma.medium.unique_paths;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void _3_2_is_6() {

        Assert.assertEquals(6, new Solution().uniquePaths(3, 3));
    }


    @Test
    public void _7_3_is_28() {
        Assert.assertEquals(28, new Solution().uniquePaths(7, 3));
    }
}