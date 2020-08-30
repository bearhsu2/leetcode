package idv.kuma.easy.count_primes;


class Solution {
    public int countPrimes(int n) {

        int count = 0;

        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
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