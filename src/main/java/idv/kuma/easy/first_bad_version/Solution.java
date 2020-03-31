package idv.kuma.easy.first_bad_version;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {


        int low = 1;
        int high = n;

        while (low < high) {


            int middle = low + (high - low) / 2;

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

