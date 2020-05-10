package idv.kuma.easy.find_the_town_judge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int findJudge(int N, int[][] trusts) {


        Set<Integer> trusters = new HashSet<>();
        Set<Integer> all = new HashSet<>();

        for (int i = 1; i <= N; i++) {
            all.add(i);
        }

        Map<Integer, Set<Integer>> trustedBy = new HashMap<>();

        for (int[] trust : trusts) {

            int truster = trust[0];

            trusters.add(truster);

            int trusted = trust[1];

            if (!trustedBy.containsKey(trusted)) {
                Set<Integer> entry = new HashSet<>();
                entry.add(truster);
                trustedBy.put(trusted, entry);
            } else {
                trustedBy.get(trusted).add(truster);
            }

        }

        all.removeAll(trusters);

        if (all.size() != 1) {
            return -1;
        }

        int candidate = all.iterator().next();

        return trusters.equals(trustedBy.get(candidate))
                ? candidate
                : -1;


    }


}
