package idv.kuma.easy.power_of_three;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void _27() {
        runAndCheck(true, 27);
    }


    private void runAndCheck(boolean expected, int number) {
        Assert.assertEquals(expected, new Solution().isPowerOfThree(number));
    }


    @Test
    public void _243() {
        runAndCheck(true, 243);
    }


    @Test
    public void n3() {
        runAndCheck(false, -3);
    }


    @Test
    public void _45() {
        runAndCheck(false, 45);
    }
}