package idv.kuma.medium.zigzag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {


        int direction = -1;

        char[] chars = s.toCharArray();

        List<StringBuilder> intermediate = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            intermediate.add(new StringBuilder());
        }


        int i = 0;
        for (char oneChar : chars) {

            System.out.println("i = " + i);

            intermediate.get(i).append(oneChar);

            if (i == numRows - 1 || i == 0) direction *= -1;

            i += direction;
        }

        StringBuilder result = new StringBuilder();
        intermediate.forEach( stringBuilder -> {
            result.append(stringBuilder);
        });

        return result.toString();
    }
}