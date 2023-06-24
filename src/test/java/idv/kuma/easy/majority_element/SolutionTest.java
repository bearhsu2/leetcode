package idv.kuma.easy.majority_element;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        Solution sut = new Solution();

        int actual = sut.majorityElement(new int[]{3, 2, 3});

        Assertions.assertThat(actual).isEqualTo(3);
    }
}