package idv.kuma.medium.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        return doPermute(list);

    }

    private List<List<Integer>> doPermute(List<Integer> list) {
        if (list.size() == 1) {
            return Collections.singletonList(list);
        }


        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            List<Integer> subListExcludeI = excludeI(list, i);

            List<List<Integer>> permutedSubLists = doPermute(subListExcludeI);

            for (List<Integer> permuted : permutedSubLists) {
                permuted.add(0, list.get(i));
            }

            result.addAll(permutedSubLists);

        }

        return result;
    }

    private List<Integer> excludeI(List<Integer> list, int excludedIndex) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i != excludedIndex) {
                result.add(list.get(i));
            }
        }

        return result;
    }
}