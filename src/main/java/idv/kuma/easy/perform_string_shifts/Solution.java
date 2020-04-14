package idv.kuma.easy.perform_string_shifts;

public class Solution {

    public String stringShift(String s, int[][] shifts) {


        int decimal = 0;
        for (int[] shift : shifts) {

            decimal += shift[1] * (shift[0] == 0 ? 1 : -1);

            decimal %= s.length();

        }


        if (decimal < 0) {
            decimal += s.length();
        }

        return s.substring(decimal) + s.substring(0, decimal);
    }
}
