package idv.kuma.easy.first_bad_version;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void _2126753390_1702766719_then_1702766719() {

        Solution solution = new Solution();

        int actual = solution.firstBadVersion(2126753390);

        Assert.assertEquals(1702766719, actual);


    }
}