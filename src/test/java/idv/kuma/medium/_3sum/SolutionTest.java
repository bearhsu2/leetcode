package idv.kuma.medium._3sum;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void name() {

        List<List<Integer>> actual = new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        Assertions.assertThat(actual).containsExactly(
                Arrays.asList(-1, 0, 1),
                Arrays.asList(-1, -1, 2)
        );
    }
}