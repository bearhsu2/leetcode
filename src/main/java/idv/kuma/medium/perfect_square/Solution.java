package idv.kuma.medium.perfect_square;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {


    public List<Integer> perfectSquares;


    public int numSquares(int n) {


        perfectSquares = findPerfectSquares(n);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(n);

        for (int level = 1; ; level++) {

            Queue<Integer> nextLevelQueue = new LinkedList<>();

            while (!queue.isEmpty()) {

                Integer value = queue.poll();

                if (isPerfectSquare(value)) {
                    return level;
                } else {

                    for (int minuend : perfectSquares) {

                        if (minuend >= value) {
                            break;
                        }

                        nextLevelQueue.add(value - minuend);

                    }

                }

            }

            queue = nextLevelQueue;

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

