package idv.kuma.easy.first_bad_version;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {


        int low = 1;
        int high = n;

        while (low <= high) {


            double middleDoubleValue = (0D + low + high) / 2;

            int middle = (int) middleDoubleValue;

            boolean middleIsBad = isBadVersion(middle);
            if (middleIsBad) {
                if (middle == 1 || !isBadVersion(middle - 1)) {
                    return middle;
                } else {
                    high = middle - 1;
                }
            } else {
                low = middle + 1;

            }


        }

        return Integer.MIN_VALUE;

    }
}

