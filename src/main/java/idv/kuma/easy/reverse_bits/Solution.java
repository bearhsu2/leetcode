package idv.kuma.easy.reverse_bits;


public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {


        int answer = 0;
        for (int i = 0; i < 32; i++) {

            int bit = n >>> i & 1;

            answer = (answer << 1) | bit;

        }

        return answer;
    }
}

