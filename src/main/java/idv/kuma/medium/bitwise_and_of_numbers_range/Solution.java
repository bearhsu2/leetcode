package idv.kuma.medium.bitwise_and_of_numbers_range;

public class Solution {
    public int rangeBitwiseAnd(int m, int n) {

        int bit = 1;
        int answer = 0;
        int range = n - m;
        for (int i = 0; i < 32; i++) {

            if (range <= bit && (n & bit) != 0 && (m & bit) != 0) {
                answer += bit;
            }

            bit <<= 1;
        }

        return answer;

    }
}

