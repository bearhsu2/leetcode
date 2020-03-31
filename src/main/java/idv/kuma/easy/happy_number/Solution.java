package idv.kuma.easy.happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {

        Set<Integer> visited = new HashSet<>();


        while (n != 1) {
            n = nextGeneration(n);

            if (!visited.add(n)) {
                return false;
            }

        }


        return true;
    }


    private int nextGeneration(int n) {
        int newN = 0;

        while (n > 0) {
            int digit = n % 10;
            newN += Math.pow(digit, 2);
            n /= 10;
        }

        return newN;
    }


}