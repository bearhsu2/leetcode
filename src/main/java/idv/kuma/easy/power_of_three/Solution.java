package idv.kuma.easy.power_of_three;

public class Solution {


    public boolean isPowerOfThree(int n) {

        return (Math.log10(n) / Math.log10(3) % 1) == 0;

    }
}
