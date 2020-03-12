package idv.kuma.medium.perfect_square;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private Set<Integer> knownSquares;


    public Solution() {
        knownSquares = new HashSet<>();
    }


    public int numSquares(int n) {

        if (n == 1) return 1;

        if (isPerfectSquare(n)) {
            return 1;
        }

        knownSquares.add(1);

        int[] minNum = new int[n + 1];
        minNum[0] = 0;
        minNum[1] = 1;
        for (int i = 2; i <= n; i++) {

            if (isPerfectSquare(i)) {
                minNum[i] = 1;
                knownSquares.add(i * i);
            } else {

                // find largest perfect square less than i, say x
                int x = 0;
                for (int j = i; j > 0; j--) {
                    if (isPerfectSquare(j)) {
                        x = j;
                        break;
                    }
                }


                // minNum[i] = 1 + minNum[i-x^2]
                minNum[i] = 1 + minNum[i - x * x];

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
