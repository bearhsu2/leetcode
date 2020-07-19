package idv.kuma.easy.string_to_integer_atoi;

class Solution {
    public int myAtoi(String str) {

        String trimmed = str.trim();

        String numbers[] = trimmed.split(" ");


        Long longValue = null;
        try {
            longValue = Long.valueOf(numbers[0]);

            if (longValue < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (longValue>Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

        } catch (NumberFormatException e) {
            return 0;
        }


        return longValue.intValue();

    }
}