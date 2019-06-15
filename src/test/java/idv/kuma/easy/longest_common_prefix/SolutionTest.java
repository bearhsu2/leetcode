package idv.kuma.easy.longest_common_prefix;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void aaa_vvvb_Then_empty() {
        Assert.assertEquals("", createAndRun("aaa", "vvvb"));
    }

    @Test
    public void flower_flow_flight_Then_fl() {
        Assert.assertEquals("fl", createAndRun("flower", "flow", "flight"));
    }

    @Test
    public void dog_racecar_car_Then_empty() {
        Assert.assertEquals("", createAndRun("dog", "racecar", "car"));
    }


    @Test
    public void empty_empty_car_Then_empty() {
        Assert.assertEquals("", createAndRun("", "", ""));
    }


    private String createAndRun(String... strs) {
        return new Solution().longestCommonPrefix(strs);
    }
}