package idv.kuma.easy.hamming_distance;

public class Solution {
    public int hammingDistance(int x, int y) {
        return hamming(x ^ y);
    }


    private int hamming(int n) {

        int result = 0;

        while (n > 0) {

            result += n & 1;
            n >>= 1;
        }

        return result;
    }
}
