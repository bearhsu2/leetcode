package idv.kuma.easy.climing_stairs;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    static Map<Integer, Integer> nToWays = new HashMap<>();

    static {

        nToWays.put(1, 1);
        nToWays.put(2, 2);

    }

    public int climbStairs(int n) {

        Integer ways = nToWays.get(n);

        if (Objects.isNull(ways)) {
            int value = climbStairs(n - 1) + climbStairs(n - 2);
            nToWays.put(n, value);
            return value;
        } else {
            return ways;
        }


    }

}

