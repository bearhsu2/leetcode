package idv.kuma.integer_to_roman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {


    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

    }

    @Test
    public void When_1_Then_I() throws Exception {
        runAndCheck(1, "I");
    }

    @Test
    public void When_2_Then_II() throws Exception {
        runAndCheck(2, "II");
    }

    private void runAndCheck(int num, String expect) {
        Assert.assertEquals(expect, solution.intToRoman(num));
    }
}