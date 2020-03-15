package idv.kuma.medium.perfect_square;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    private List<Integer> perfectSquares;
    private int[] minNum;


    public int numSquares(int n) {

        perfectSquares = findPerfectSquares(n);
        minNum = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            if (perfectSquares.contains(i)) {
                minNum[i] = 1;
            } else {

                int finalI = i;
                List<Integer> deductions = perfectSquares.stream().filter(v -> v < finalI).collect(Collectors.toList());

                Integer formerMinNum = null;
                for (Integer deduction : deductions) {
                    int candidate = minNum[i - deduction];

                    if (formerMinNum == null || candidate < formerMinNum) {
                        formerMinNum = candidate;
                    }

                }

                minNum[i] = 1+ formerMinNum;

            }

        }

        return minNum[n];


    }


    private List<Integer> findPerfectSquares(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
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
