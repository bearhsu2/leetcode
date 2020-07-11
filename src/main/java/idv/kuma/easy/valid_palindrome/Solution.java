package idv.kuma.easy.valid_palindrome;

public class Solution {
    public Solution() {
    }


    public boolean isPalindrome(String s) {

        int length = s.length();

        int head = 0;
        int tail = length - 1;

        while (head <= tail && head <= length - 1 && tail >= 0) {

            if (!isAlphaNumeric(s.charAt(head))) {
                head++;
                continue;
            } else if (!isAlphaNumeric(s.charAt(tail))) {
                tail--;
                continue;
            }


            if (Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))) {
                return false;
            }

            head++;
            tail--;
        }


        return true;
    }


    private boolean isAlphaNumeric(char c) {

        return (c >= 'a' && c <= 'z')
                || (c >= 'A' && c <= 'Z')
                || (c >= '0' && c <= '9');

    }

}
