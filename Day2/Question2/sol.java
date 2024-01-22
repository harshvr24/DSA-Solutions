import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();

            int[] cream = new int[n];
            for (int i = 0; i < n; i++) {
                cream[i] = scanner.nextInt();
            }

            napoleonCake(cream);

            for (int i = 0; i < n; i++) {
                System.out.print(cream[i] + " ");
            }
            System.out.println();
        }
    }

    static void napoleonCake(int[] cream) {
        int n = cream.length;
        int creamLeft = 0;

        for (int i = n - 1; i >= 0; i--) {
            creamLeft = Math.max(creamLeft, cream[i]);
            cream[i] = (creamLeft > 0) ? 1 : 0;
            creamLeft--;
        }
    }
}
