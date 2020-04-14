package idv.kuma.easy.perform_string_shifts;

public class Solution {

    public String stringShift(String s, int[][] shifts) {


        int decimalShift = 0;
        for (int[] shift : shifts) {
            decimalShift += shift[1] * (shift[0] == 0 ? 1 : -1);
        }

        



        return "";
    }
}
