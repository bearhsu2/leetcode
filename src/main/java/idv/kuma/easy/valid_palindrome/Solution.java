package idv.kuma.easy.valid_palindrome;

public class Solution {
    public Solution() {
    }


    public boolean isPalindrome(String s) {

        int length = s.length();

        if (length == 0) {
            return true;
        }

        int head = findNextAlphabeticNumeric(0, s);
        int tail = findPreviousAlphabeticNumeric(length - 1, s);

        while (head <= tail && head <= length - 1 && tail >= 0) {

            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }

            head = findNextAlphabeticNumeric(head + 1, s);
            tail = findPreviousAlphabeticNumeric(tail - 1, s);

        }


        return true;
    }


    private int findNextAlphabeticNumeric(int index, String s) {

        while (index < s.length() && !isAlphaNumeric(s.charAt(index))) {
            index++;
        }

        return index;
    }


    private int findPreviousAlphabeticNumeric(int index, String s) {
        while (index >= 0 && !isAlphaNumeric(s.charAt(index))) {
            index--;
        }

        return index;
    }


    private boolean isAlphaNumeric(char c) {

        return (c >= 'a' && c <= 'z')
                || (c >= 'A' && c <= 'Z')
                || (c >= '0' && c <= '9');

    }
}
