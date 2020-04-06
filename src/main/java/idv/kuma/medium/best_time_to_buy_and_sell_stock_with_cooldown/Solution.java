package idv.kuma.medium.best_time_to_buy_and_sell_stock_with_cooldown;

public class Solution {
    public int maxProfit(int[] prices) {


        int length = prices.length;

        if (length <= 0) {
            return 0;
        }

        int[] profitOnBuying = new int[length];
        int[] profitOnSelling = new int[length];
        int[] profitOnCoolDown = new int[length];

        profitOnBuying[0] = -prices[0];
        profitOnSelling[0] = 0;
        profitOnCoolDown[0] = 0;

        for (int i = 1; i < length; i++) {

            profitOnBuying[i] = Math.max(
                    profitOnBuying[i - 1], profitOnCoolDown[i - 1] - prices[i]
            );

            profitOnSelling[i] = Math.max(
                    profitOnSelling[i - 1], profitOnBuying[i - 1] + prices[i]
            );

            profitOnCoolDown[i] = Math.max(
                    profitOnCoolDown[i - 1], profitOnSelling[i - 1]
            );

        }

        return Math.max(profitOnCoolDown[length - 1], profitOnSelling[length - 1]);

    }
}