package idv.kuma.medium.perfect_square;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public int numSquares(int n) {

        List<Integer> perfectSquares = new ArrayList<>();

        int[] minNum = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            if (isPerfectSquare(i)) {
                perfectSquares.add(i);
                minNum[i] = 1;
            } else {
                int finalI = i;

                minNum[i] = 1 + perfectSquares
                        .stream()
                        .filter(v -> v < finalI)
                        .mapToInt(d -> minNum[finalI - d])
                        .min()
                        .getAsInt();
            }

        }

        return minNum[n];


    }


    private boolean isPerfectSquare(double x) {

        // finding the square root of given number
        double sq = Math.sqrt(x);

        /* Math.floor() returns closest integer value, for
         * example Math.floor of 984.1 is 984, so if the value
         * of sq is non integer than the below expression would
         * be non-zero.
         */
        return ((sq - Math.floor(sq)) == 0);
    }



}
