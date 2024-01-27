import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            // Set a1 and a2 to 1, and a3 to n - 2.
            System.out.println(1 + " " + 1 + " " + (n - 2));
        }
    }
}
