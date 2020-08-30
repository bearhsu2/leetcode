package idv.kuma.easy.count_primes;


class Solution {
    public int countPrimes(int n) {

        if (n <= 1) {
            return 0;
        }

        boolean[] plural = new boolean[n];
        plural[0] = true;
        plural[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!plural[i]) {
                for (int j = i * i; j < n; j += i) {
                    plural[j] = true;
                }
            }
        }


        int count = 0;
        for (int i = 1; i < n; i++) {
            if (!plural[i]) {
                count++;
            }
        }


        return count;

    }


    private boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {
                return false;
            }

        }

        return true;
    }
}