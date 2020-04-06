package idv.kuma.medium.best_time_to_buy_and_sell_stock_with_cooldown;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {


    @Test
    public void _1_2_3_0_2_Then_3() {
        runAndCheck(new int[]{1, 2, 3, 0, 2}, 3);
    }


    private void runAndCheck(int[] prices, int expected) {
        Assertions.assertThat(
                new Solution().maxProfit(prices))
                .isEqualTo(expected);
    }

//
//    @Test
//    public void _7_6_4_3_1_Then_0() {
//        runAndCheck(new int[]{7, 6, 4, 3, 1}, 0);
//    }
//
//
//    @Test
//    public void _1_2_3_4_5_Then_4() {
//        runAndCheck(new int[]{1, 2, 3, 4, 5}, 4);
//    }

}
