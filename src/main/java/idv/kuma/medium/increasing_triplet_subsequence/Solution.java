package idv.kuma.medium.increasing_triplet_subsequence;


class Solution {
    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) {
            return false;
        }

        Integer lowestSlash = null;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1]) {

                if (lowestSlash == null) {
                    lowestSlash = i;
                } else if (
                        nums[lowestSlash] < nums[i]
                                || nums[lowestSlash + 1] < nums[i + 1]) {
                    return true;
                } else {
                    lowestSlash = i;
                }
            }


        }

        return false;
    }
}