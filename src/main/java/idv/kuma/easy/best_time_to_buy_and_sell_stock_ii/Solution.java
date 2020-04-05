package idv.kuma.easy.best_time_to_buy_and_sell_stock_ii;

public class Solution {
    // greedy, array
    public int maxProfit(int[] prices) {

        int result = 0;
        for (int i = 1; i < prices.length; i++) {

            int diff = prices[i] - prices[i - 1];

            if (diff > 0) {
                result += diff;
            }

        }

        return result;
    }
}