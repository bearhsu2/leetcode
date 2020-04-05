package idv.kuma.easy.best_time_to_buy_and_sell_stock_ii;

public class Solution {
    // greedy, array
    public int maxProfit(int[] prices) {

        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                result += prices[i] - prices[i - 1];
            }
        }


        return result;
    }
}