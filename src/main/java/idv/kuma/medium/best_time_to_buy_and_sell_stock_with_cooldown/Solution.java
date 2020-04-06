package idv.kuma.medium.best_time_to_buy_and_sell_stock_with_cooldown;

public class Solution {
    public int maxProfit(int[] prices) {

        int length = prices.length;

        if (length <= 1) {
            return 0;
        }

        int numRaises = length-1;
        int[] raises = new int[numRaises];
        int[] maxProfit = new int[numRaises];

        for (int i = 1; i < length; i++) {
            raises[i - 1] = prices[i] - prices[i - 1];
        }

        maxProfit[0] = Math.max(raises[0], 0);
        if (numRaises == 1) {
            return maxProfit[0];
        }


        if (raises[1] > 0) {
            if (raises[0] > 0) {
                maxProfit[1] = maxProfit[0] + raises[1];
            } else {
                maxProfit[1] = raises[1];
            }
        } else {
            maxProfit[1] = maxProfit[0];
        }
        if (numRaises == 2) {
            return maxProfit[1];
        }

        if (raises[2] > 0) {
            if (raises[1] > 0) {
                maxProfit[2] = maxProfit[1] + raises[2];
            } else {
                maxProfit[2] = Math.max(
                        raises[2],
                        maxProfit[0]
                );
            }
        } else {
            maxProfit[2] = maxProfit[1];
        }
        if (numRaises == 3) {
            return maxProfit[2];
        }


        for (int i = 3; i < maxProfit.length; i++) {

            if (raises[i] > 0) {

                if (raises[i - 1] > 0) {
                    maxProfit[i] = maxProfit[i - 1] + raises[i];
                } else {
                    maxProfit[i] = Math.max(
                            maxProfit[i - 3] + raises[i],
                            maxProfit[i - 2]
                    );
                }
            } else {
                maxProfit[i] = maxProfit[i - 1];
            }

        }

        return maxProfit[raises.length - 1];

    }
}