package idv.kuma.easy.missing_number;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {

        Assertions.assertThat(new Solution().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);

    }
}