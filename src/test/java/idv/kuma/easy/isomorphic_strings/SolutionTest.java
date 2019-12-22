package idv.kuma.easy.isomorphic_strings;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void When_egg_add_Then_True() {
        runAndCheck("egg", "add", true);
    }


    private void runAndCheck(String s, String t, boolean expected) {
        Assert.assertEquals(expected, new Solution().isIsomorphic(s, t));
    }


    @Test
    public void When_paper_title_Then_true() {
        runAndCheck("paper", "title", true);
    }


    @Test
    public void When_foo_bar_Then_False() {
        runAndCheck("foo", "bar", false);
    }
}