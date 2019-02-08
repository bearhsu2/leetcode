package idv.kuma.roman_to_integer;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void When_V_Then_5() throws Exception {
        Solution solution = new Solution();

        Assert.assertEquals(5, solution.romanToInt("V"));
    }
}