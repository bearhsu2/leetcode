package idv.kuma.easy.word_pattern;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void When_abba_With_dog_cat_cat_dog_Then_true() {

        Solution solution = new Solution();

        String pattern = "abba";
        String str = "dog cat cat dog";
        boolean actual = solution.wordPattern(pattern, str);

        Assert.assertEquals(true, actual);


    }
}