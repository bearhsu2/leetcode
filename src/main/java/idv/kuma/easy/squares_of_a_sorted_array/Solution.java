package idv.kuma.easy.squares_of_a_sorted_array;

public class Solution {
    public int[] sortedSquares(int[] numbers) {

        int length = numbers.length;

        int head = 0;
        int tail = length - 1;

        int[] result = new int[length];

        int current = length - 1;
        while (head <= tail) {

            int absHead = Math.abs(numbers[head]);
            int absTail = Math.abs(numbers[tail]);

            if (absHead <= absTail) {
                result[current] = (int) Math.pow(absTail, 2);
                tail--;
            } else {
                result[current] = (int) Math.pow(absHead,2);
                head++;
            }

            current--;

        }


        return result;
    }
}
