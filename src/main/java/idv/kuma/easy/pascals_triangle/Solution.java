package idv.kuma.easy.pascals_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> answer = new ArrayList<>();

        answer.add(new ArrayList<>(Collections.singletonList(1)));


        for (int i = 1; i < numRows; i++) {

            List<Integer> previous = answer.get(i - 1);

            List<Integer> current = new ArrayList<>();
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    current.add(1);
                } else {
                    current.add(previous.get(j-1) + previous.get(j));
                }
            }
            answer.add(current);

        }

        return answer;
    }
}

