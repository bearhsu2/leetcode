package idv.kuma.easy.rotate_array;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {

        int length = nums.length;

        k = k % length;


        int edge = length - k;
        int[] tail = Arrays.copyOfRange(nums, edge, length);
        int[] head = Arrays.copyOfRange(nums, 0, edge);


        int i = 0;

        for (int element : tail) {
            nums[i] = element;
            i++;
        }

        for (int element : head) {
            nums[i] = element;
            i++;
        }
        System.out.println("aa");

    }


    private void doRotate(int[] nums) {

        int template = nums[0];

        int length = nums.length;
        for (int i = length - 1; i >= 0; i--) {
            nums[(i + 1) % length] = nums[i];
        }

        nums[(1 % length)] = template;

    }
}