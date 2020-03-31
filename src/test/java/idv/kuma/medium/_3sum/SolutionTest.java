package idv.kuma.medium._3sum;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void name() {

        Assertions.assertThat(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4})).containsExactly(
                Arrays.asList(-1, 0, 1),
                Arrays.asList(-1, -1, 2)
        );
    }


    @Test
    public void all_zeros() {

        Assertions.assertThat(new Solution().threeSum(new int[]{0, 0, 0, 0})).containsExactly(
                Arrays.asList(0, 0, 0)
        );
    }
}