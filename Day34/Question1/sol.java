import java.util.Arrays;

public class SortedMatrix {
    public static int[][] sortedMatrix(int N, int[][] Mat) {
        int[] flattenedMatrix = new int[N * N];

        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                flattenedMatrix[index++] = Mat[i][j];
            }
        }

        Arrays.sort(flattenedMatrix);

        int[][] result = new int[N][N];

        index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = flattenedMatrix[index++];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int N1 = 4;
        int[][] Mat1 = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int[][] result1 = sortedMatrix(N1, Mat1);

        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < N1; j++) {
                System.out.print(result1[i][j] + " ");
            }
            System.out.println();
        }

        int N2 = 3;
        int[][] Mat2 = {{1, 5, 3}, {2, 8, 7}, {4, 6, 9}};
        int[][] result2 = sortedMatrix(N2, Mat2);

        for (int i = 0; i < N2; i++) {
            for (int j = 0; j < N2; j++) {
                System.out.print(result2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
