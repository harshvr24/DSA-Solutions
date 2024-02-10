import java.util.Scanner;

public class BuddyNIM {
    static String findWinner(int n, int m, int[] A, int[] B) {
        int xorSum = 0;
        
        for (int size : A)
            xorSum ^= size;
        
        for (int size : B)
            xorSum ^= size;
        
        return (xorSum == 0) ? "Bob" : "Alice";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[] A = new int[n];
            int[] B = new int[m];

            for (int i = 0; i < n; ++i)
                A[i] = scanner.nextInt();

            for (int i = 0; i < m; ++i)
                B[i] = scanner.nextInt();

            String result = findWinner(n, m, A, B);
            System.out.println(result);
        }

        scanner.close();
    }
}
