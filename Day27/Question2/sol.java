import java.util.Scanner;

public class BirthdayArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int start = -1, end = -1;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                start = i;
                break;
            }
        }

        for (int i = n - 1; i > 0; i--) {
            if (a[i] < a[i - 1]) {
                end = i;
                break;
            }
        }

        if (start == -1 && end == -1) {
            System.out.println("yes");
            System.out.println("1 1");
        } else {
            reverseArraySegment(a, start, end);
            if (isSorted(a)) {
                System.out.println("yes");
                System.out.println((start + 1) + " " + (end + 1));
            } else {
                System.out.println("no");
            }
        }
    }

    private static void reverseArraySegment(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
