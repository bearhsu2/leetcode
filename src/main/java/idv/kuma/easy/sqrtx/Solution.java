package idv.kuma.easy.sqrtx;

public class Solution {
    public int mySqrt(int x) {

        if (x <= 1) {
            return x;
        }

        return doSqrt(1, x / 2, x);

    }


    private int doSqrt(long x, long y, int target) {

        long m = (x + y) / 2;

        long value = m * m;


        if (target == value
                || (value < target && (m + 1) * (m + 1) > target)) {
            return (int) m;
        }

        if (value > target) {
            return doSqrt(x, m - 1, target);
        } else {
            return doSqrt(m + 1, y, target);
        }

    }
}
