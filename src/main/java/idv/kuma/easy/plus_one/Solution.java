package idv.kuma.easy.plus_one;

public class Solution {
    public int[] plusOne(int[] digits) {

        int carry = 0;

        int[] result = new int[digits.length];

        int maxIndex = digits.length - 1;
        for (int i = maxIndex; i >= 0; i--) {

            int digit = digits[i]
                    + carry
                    + (i == maxIndex ? 1 : 0);
            carry = 0;

            if (digit >= 10) {
                carry = 1;
                digit -= 10;
            }

            result[i] = digit;

        }

        return carry >= 1
                ? insertLeadingOne(result)
                : result;
    }


    private int[] insertLeadingOne(int[] original) {
        int[] result = new int[original.length + 1];

        result[0] = 1;

        System.arraycopy(original, 0, result, 1, original.length);
        return result;
    }
}
