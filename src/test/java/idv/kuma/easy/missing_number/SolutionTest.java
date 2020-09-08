package idv.kuma.easy.missing_number;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        Solution solution = new Solution();
        int actual = solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});

        Assertions.assertThat(actual).isEqualTo(8);

    }
}