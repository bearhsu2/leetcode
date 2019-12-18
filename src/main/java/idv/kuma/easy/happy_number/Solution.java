package idv.kuma.easy.happy_number;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {


        Set<Integer> visited = new HashSet<>();

        while (n != 1) {
            n = nextGeneration(n);

            if (visited.contains(n)) {
                return false;
            }

            visited.add(n);
        }


        return true;
    }


    private int nextGeneration(int n) {

        List<Integer> list = separate(n);

        int newN = 0;
        for (Integer integer : list) {
            newN += Math.pow(integer, 2);
        }


        return newN;
    }


    private List<Integer> separate(int i) {

        List<Integer> digits = new ArrayList<>();
        while (i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
        return digits;

    }
}