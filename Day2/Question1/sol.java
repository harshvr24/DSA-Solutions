import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        long l = scanner.nextLong();
        long r = scanner.nextLong();

        // Finding pairs
        findPairs(l, r);
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static void findPairs(long l, long r) {
        if (r - l + 1 <= 2) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        for (long i = l; i < r; i += 2) {
            System.out.println((i + 1) + " " + (i + 2));
        }
    }
}
