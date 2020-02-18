package idv.kuma.medium.binary_number_with_alternating_bits;

public class Solution {
    public boolean hasAlternatingBits(int n) {

        int xored = n >> 1 ^ n;

        int added = xored + 1;

        return (added & xored) == 0;

    }
}
