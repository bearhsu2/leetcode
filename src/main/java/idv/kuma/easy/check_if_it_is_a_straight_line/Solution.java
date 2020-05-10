package idv.kuma.easy.check_if_it_is_a_straight_line;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        if (coordinates.length == 2) {
            return false;
        }


        int[] first = coordinates[0];
        int[] second = coordinates[1];


        for (int i = 2; i < coordinates.length; i++) {

            int[] candidate = coordinates[i];

            if (!isSameLine(first, second, candidate)) return false;


        }

        return true;
    }


    private boolean isSameLine(int[] first, int[] second, int[] candidate) {

        return (candidate[0] - first[0]) * (second[1] - first[1])
                == (candidate[1] - first[1]) * (second[0] - first[0]);

    }

}