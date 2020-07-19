package idv.kuma.easy.string_to_integer_atoi;

class Solution {
    public int myAtoi(String str) {

        String trimmed = str.trim();

        if (trimmed.length() <= 0) {
            return 0;
        }

        String numbers[] = trimmed.split("[^0-9]");

        Long longValue = null;
        try {


            if (numbers.length <= 0) {
                return 0;
            }

            if (numbers.length >= 2
                    && "".equalsIgnoreCase(numbers[0])
                    && trimmed.charAt(0) == '-') {
                longValue = -Long.valueOf(numbers[1]);
            } else {
                longValue = Long.valueOf(numbers[0]);
            }


            if (longValue < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (longValue > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

        } catch (NumberFormatException e) {
            return 0;
        }


        return longValue.intValue();

    }
}