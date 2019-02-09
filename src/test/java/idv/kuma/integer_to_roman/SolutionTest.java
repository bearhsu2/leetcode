package idv.kuma.integer_to_roman;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void When_1_Then_I() throws Exception {

        Solution solution = new Solution();

        Assert.assertEquals("I", solution.intToRoman(1));
    }
}