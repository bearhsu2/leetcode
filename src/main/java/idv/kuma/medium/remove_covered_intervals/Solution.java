package idv.kuma.medium.remove_covered_intervals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
//        List<int[]> sorted = Arrays.stream(intervals)
//                .sorted(Comparator.comparingInt(a -> a[0]))
//                .collect(Collectors.toList());

        Arrays.sort(intervals, (a, b) -> {
            int lResult = a[0] - b[0];
            if (lResult != 0) {
                return lResult;
            }
            return b[1] - a[1];
        });

        List<int[]> sorted = Arrays.stream(intervals).collect(Collectors.toList());
        int result = sorted.size();

        Set<Integer> removedIndex = new HashSet<>();
        for (int i = 0; i < sorted.size() - 1; i++) {
            if (removedIndex.contains(i)) continue;

            int[] current = sorted.get(i);

            for (int j = i + 1; j < sorted.size() ; j++) {
                int[] next = sorted.get(j);
                if (next[1] <= current[1]) {
                    result--;
                    removedIndex.add(j);
                } else {
                    break;
                }
            }
        }


        return result;
    }
}