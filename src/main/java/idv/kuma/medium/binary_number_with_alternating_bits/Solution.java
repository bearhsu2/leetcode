package idv.kuma.medium.binary_number_with_alternating_bits;

public class Solution {
    public boolean hasAlternatingBits(int n) {

        int shifted = n >> 1;

        System.out.println(n);
        System.out.println(shifted);

        int xored = shifted ^ n;

        System.out.println(xored);

        int added = xored + 1;

        System.out.println(added);


        int result = added & xored;

        System.out.println(result);

        System.out.println("--------");

        return result == 0;

    }
}
