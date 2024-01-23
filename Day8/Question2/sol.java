import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();

            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            long maxSum = A[0];
            long currentSum = A[0];

            for (int i = 1; i < N * K; i++) {
                currentSum = Math.max((long) A[i % N], currentSum + A[i % N]);
                maxSum = Math.max(maxSum, currentSum);
            }

            System.out.println(maxSum);
        }
    }
}
