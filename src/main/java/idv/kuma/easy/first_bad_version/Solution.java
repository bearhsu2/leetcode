package idv.kuma.easy.first_bad_version;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {


        int low = 1;
        int high = n;

        while (low < high) {


            long middleLongValue = (0L + low + high) / 2;

            int middle = (int) middleLongValue;

            boolean middleIsBad = isBadVersion(middle);
            if (middleIsBad) {
                high = middle;
            } else {
                low = middle + 1;

            }


        }

        return low;

    }
}

