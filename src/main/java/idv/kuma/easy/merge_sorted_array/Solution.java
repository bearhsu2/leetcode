package idv.kuma.easy.merge_sorted_array;

public class Solution {
    public void merge(int[] target, int m, int[] input2, int n) {

        int i = 0;
        int j = 0;

        int[] input1 = makeMirror(target, m);

        int current = 0;
        while (current < m + n) {

            if (i >= m) {
                target[current] = input2[j];
                j++;
            } else if (j >= n) {
                target[current] = input1[i];
                i++;
            } else {

                int num1 = input1[i];
                int num2 = input2[j];

                if (num1 <= num2) {
                    target[current] = num1;
                    i++;
                } else {
                    target[current] = num2;
                    j++;
                }
            }

            current++;
        }

    }


    private int[] makeMirror(int[] nums, int m) {
        int[] result = new int[m];

        System.arraycopy(nums, 0, result, 0, m);

        return result;
    }
}
