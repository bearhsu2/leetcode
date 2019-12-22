package idv.kuma.easy.word_pattern;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void When_abba_With_dog_dog_dog_dog_Then_false() {

        runAndCheck("abba", "dog dog dog dog", false);
    }


    @Test
    public void When_aaaa_With_dog_cat_cat_dog_Then_false() {

        runAndCheck("aaaa", "dog cat cat dog", false);
    }

    @Test
    public void When_abba_With_dog_cat_cat_fish_Then_false() {

        runAndCheck("abba", "dog cat cat fish", false);
    }


    private void runAndCheck(String pattern, String string, boolean expected) {
        Assert.assertEquals(expected, new Solution().wordPattern(pattern, string));
    }


    @Test
    public void When_abba_With_dog_cat_cat_dog_Then_true() {

        runAndCheck("abba", "dog cat cat dog", true);

    }
}