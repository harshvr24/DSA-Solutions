public class RowWithMax1s {
    public static int rowWithMax1s(int N, int M, int[][] arr) {
        int row = -1;
        int col = M - 1;

        for (int i = 0; i < N; i++) {
            while (col >= 0 && arr[i][col] == 1) {
                row = i;
                col--;
            }
        }

        return row;
    }

    public static void main(String[] args) {
        // Example usage
        int N1 = 4, M1 = 4;
        int[][] Arr1 = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(N1, M1, Arr1));  // Output: 2

        int N2 = 2, M2 = 2;
        int[][] Arr2 = {{0, 0}, {1, 1}};
        System.out.println(rowWithMax1s(N2, M2, Arr2));  // Output: 1
    }
}
