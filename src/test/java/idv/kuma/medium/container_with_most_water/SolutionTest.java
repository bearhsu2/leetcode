package idv.kuma.medium.container_with_most_water;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void name() {
        Assert.assertEquals(
                49,
                new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}
                ));
    }
}