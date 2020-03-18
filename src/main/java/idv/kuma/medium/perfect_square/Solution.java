package idv.kuma.medium.perfect_square;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public int numSquares(int n) {

        List<Integer> perfectSquares = findPerfectSquares(n);

        Set<Integer> set = new HashSet<>();

        set.add(n);

        for (int level = 1; ; level++) {

            Set<Integer> nextLevelSet = new HashSet<>();

            for (Integer value : set) {

                if (isPerfectSquare(value)) {
                    return level;
                } else {

                    for (int minuend : perfectSquares) {

                        if (minuend <= value) {
                            nextLevelSet.add(value - minuend);
                        }


                    }

                }

            }

            set = nextLevelSet;

        }


    }


    private List<Integer> findPerfectSquares(int n) {
        List<Integer> result = new ArrayList<>();

        int end = n / 2;
        for (int i = 1; i <= end; i++) {
            int square = i * i;
            if (square <= n) {
                result.add(square);
            }
        }

        return result;
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

