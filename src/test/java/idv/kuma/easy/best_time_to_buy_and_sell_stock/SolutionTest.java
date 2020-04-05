package idv.kuma.easy.best_time_to_buy_and_sell_stock;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void _7_1_5_3_6_4_Then_5() {
        runAndCheck(new int[]{7, 1, 5, 3, 6, 4}, 5);
    }


    private void runAndCheck(int[] prices, int expected) {
        Assertions.assertThat(
                new Solution().maxProfit(prices))
                .isEqualTo(expected);
    }


    @Test
    public void _7_6_4_3_1_Then_0() {
        runAndCheck(new int[]{7, 6, 4, 3, 1}, 0);
    }


    @Test
    public void _1_2_3_4_5_Then_4() {
        runAndCheck(new int[]{1, 2, 3, 4, 5}, 4);
    }

}