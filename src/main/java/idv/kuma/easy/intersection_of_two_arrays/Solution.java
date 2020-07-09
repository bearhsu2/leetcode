package idv.kuma.easy.intersection_of_two_arrays;

import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        Set<Integer> result = new HashSet<>();
        while (i < nums1.length && j < nums2.length) {

            int v1 = nums1[i];
            int v2 = nums2[j];
            if (v1 == v2) {
                result.add(v1);
                i++;
                j++;
            } else if (v1 < v2) {
                i++;
            } else {
                j++;
            }

        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}

