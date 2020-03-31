package idv.kuma.easy.reverse_integer;

public class Solution {
    public int reverse(int x) {
        long rev = 0L;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;

            if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
                return 0;
            }
        }

        return (int) rev;
    }
}