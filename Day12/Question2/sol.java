import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            // Set a1 and a2 to 1, and distribute the remaining sum to a3, a4, ..., ak.
            System.out.print(1 + " " + 1 + " ");
            for (int i = 3; i <= k; ++i) {
                System.out.print((n - k + i - 1) + " ");
            }
            System.out.println();
        }
    }
}
