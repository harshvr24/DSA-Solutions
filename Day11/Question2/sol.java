import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);

            for (int i : a) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
