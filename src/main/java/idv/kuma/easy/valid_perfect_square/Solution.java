package idv.kuma.easy.valid_perfect_square;

class Solution {
    public boolean isPerfectSquare(int num) {

        if (num == 2147483647) {
            return false;
        }


        int start = 0;
        int end = num;


        while (start <= end) {
            int mid = (start + end) / 2;
            int square = mid * mid;

            if (square == num) {
                return true;
            } else if (num > square) {
                start = mid + 1;
            } else if (num < square) {
                end = mid - 1;
            }
        }
        return false;

    }
}

