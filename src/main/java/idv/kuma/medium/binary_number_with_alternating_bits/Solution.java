package idv.kuma.medium.binary_number_with_alternating_bits;

public class Solution {
    public boolean hasAlternatingBits(int n) {

        n = n >> 1 ^ n;

        return (n + 1 & n) == 0;

    }
}
