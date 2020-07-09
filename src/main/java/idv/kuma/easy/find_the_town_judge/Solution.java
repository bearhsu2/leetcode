package idv.kuma.easy.find_the_town_judge;

public class Solution {
    public int findJudge(int N, int[][] trusts) {


        if (N == 1) {
            return 1;
        }

        int[] trusted = new int[N + 1];

        for (int[] trust : trusts) {
            trusted[trust[0]]--;
            trusted[trust[1]]++;
        }


        for (int i = 1; i <= N; i++) {

            if (trusted[i] == N - 1) {
                return i;
            }

        }

        return -1;



    }


}
