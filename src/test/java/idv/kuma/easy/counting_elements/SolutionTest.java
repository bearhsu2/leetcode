package idv.kuma.easy.counting_elements;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {


//    Input: arr = [1,1,3,3,5,5,7,7]
//    Output: 0
//    Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
//    Example 3:
//
//    Input: arr = [1,3,2,3,5,0]
//    Output: 3
//    Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
//            Example 4:
//
//    Input: arr = [1,1,2,2]
//    Output: 2


    @Test
    public void _1_2_3_Then_2() {
//        Input: arr = [1,2,3]
//        Output: 2

        Assertions
                .assertThat(new Solution().countElements(new int[]{1, 2, 3}))
                .isEqualTo(2);
    }
}