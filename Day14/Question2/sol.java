import java.util.ArrayList;
import java.util.Scanner;

public class PrimeGenerator {

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> generatePrimes(int m, int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = m; i <= n; ++i) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; ++i) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            ArrayList<Integer> primes = generatePrimes(m, n);

            for (int prime : primes) {
                System.out.println(prime);
            }
            System.out.println();
        }
    }
}
