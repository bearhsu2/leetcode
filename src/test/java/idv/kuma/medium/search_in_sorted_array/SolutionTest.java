package idv.kuma.medium.search_in_sorted_array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void empty() {

        Assertions.assertThat(new Solution().search(new int[]{}, 5))
                .isEqualTo(-1);
    }


    @Test
    public void name1() {

        Assertions.assertThat(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3))
                .isEqualTo(-1);

    }


    @Test
    public void name2() {

        Assertions.assertThat(new Solution().search(new int[]{0, 1, 2, 4, 5, 6, 7}, 0))
                .isEqualTo(0);


    }


    @Test
    public void name3() {

        Assertions.assertThat(new Solution().search(new int[]{1, 2, 4, 5, 6, 7, 0}, 0))
                .isEqualTo(6);


    }


    @Test
    public void name4() {
        Assertions.assertThat(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0))
                .isEqualTo(4);
    }

}