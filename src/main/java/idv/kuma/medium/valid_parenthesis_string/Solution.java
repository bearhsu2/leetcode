package idv.kuma.medium.valid_parenthesis_string;

public class Solution {
    public boolean checkValidString(String s) {

        // Array, Greedy
        // diff: #lefts - #rights
        int minDiff = 0;
        int maxDiff = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                minDiff++;
                maxDiff++;
            } else if (c == '*') {
                minDiff--;
                maxDiff++;
            } else { // c==')'
                minDiff--;
                maxDiff--;
            }

            if (0 > maxDiff) {
                return false;
            }

            minDiff = Math.max(0, minDiff);

        }

        return minDiff == 0;
    }
}
