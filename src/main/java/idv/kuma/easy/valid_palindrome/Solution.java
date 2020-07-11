package idv.kuma.easy.valid_palindrome;

public class Solution {
    public Solution() {
    }


    public boolean isPalindrome(String s) {

        int length = s.length();

        if (length == 0) {
            return true;
        }

        int head = 0;
        int tail = length - 1;


        while (head <= tail) {

            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }


            head++;
            tail--;

        }


        return true;
    }
}
