/*
Description:
        Count the number of prime numbers less than a non-negative number, n.
*/

package Math;

public class CountPrimes {

    public static void main(String[] args) {

        CountPrimes primes = new CountPrimes();
        int n = 15;
        System.out.println(primes.countPrimes(n));
    }

    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; i * j < n; j++)
                    notPrime[i * j] = true;
            }
        }
        return count;
    }
}
