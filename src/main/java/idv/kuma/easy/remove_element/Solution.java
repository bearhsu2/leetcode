package idv.kuma.easy.remove_element;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            while (nums[i] == val && i < len) {
                nums[i] = nums[--len];
            }
        }
        return len;

    }
}