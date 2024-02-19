import java.util.Scanner;

public class InterestingSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;
            int minIndex = -1;
            int maxIndex = -1;

            for (int i = 0; i < n; i++) {
                if (a[i] < minVal) {
                    minVal = a[i];
                    minIndex = i + 1;
                }

                if (a[i] > maxVal) {
                    maxVal = a[i];
                    maxIndex = i + 1;
                }

                if (maxVal - minVal >= i + 1) {
                    System.out.println("YES");
                    System.out.println(minIndex + " " + (i + 1));
                    break;
                }
            }

            if (maxVal - minVal < n) {
                System.out.println("NO");
            }
        }
    }
}
