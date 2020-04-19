package idv.kuma.medium.search_in_sorted_array;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        Assertions.assertThat(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0))
                .isEqualTo(4);

        Assertions.assertThat(new Solution().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3))
                .isEqualTo(-1);

    }

    //Example 1:
    //
    //Input: nums = [4,5,6,7,0,1,2], target = 0
    //Output: 4
    //Example 2:
    //
    //Input: nums = [4,5,6,7,0,1,2], target = 3
    //Output: -1
}