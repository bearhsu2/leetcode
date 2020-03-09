package idv.kuma.easy.sqrtx;

public class Solution {
    public int mySqrt(int x) {

        long n = 1;

        while (true) {

            long value = n * n;

            if (value == x) {
                return (int) n;
            }

            if (value > x) {
                return (int) (n - 1);
            }

            n++;
        }

    }
}
