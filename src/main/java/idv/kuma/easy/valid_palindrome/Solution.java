package idv.kuma.easy.valid_palindrome;

public class Solution {
    public Solution() {
    }


    public boolean isPalindrome(String s) {

        int length = s.length();

        if (length == 0) {
            return true;
        }

        int head = findNextAlphaNumeric(0, s);
        int tail = findPreviousAlphaNumeric(length - 1, s);

        while (head <= tail && head <= length - 1 && tail >= 0) {

            if (Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))) {
                return false;
            }

            head = findNextAlphaNumeric(head + 1, s);
            tail = findPreviousAlphaNumeric(tail - 1, s);

        }


        return true;
    }


    private int findNextAlphaNumeric(int index, String s) {

        while (index < s.length() && !isAlphaNumeric(s.charAt(index))) {
            index++;
        }

        return index;
    }


    private int findPreviousAlphaNumeric(int index, String s) {
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
