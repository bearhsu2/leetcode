package idv.kuma.easy.best_time_to_buy_and_sell_stock;

public class Solution {
    // array
    // dp
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) { // find buying point
                minPrice = price;
            } else if (price - minPrice > maxProfit) { // find selling point
                maxProfit = price - minPrice;
            }

        }

        return maxProfit;

    }
}