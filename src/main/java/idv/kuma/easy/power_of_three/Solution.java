package idv.kuma.easy.power_of_three;

public class Solution {


    public boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }


        while (n != 1) {
            double next = n / 3.0;

            double floor = Math.floor(next);
            if (next - floor > 0) {
                return false;
            }
            n = (int) floor;
        }

        return true;
    }
}
