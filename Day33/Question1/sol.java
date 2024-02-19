import java.util.Arrays;

public class MedianOfMatrix {
    public static int median(int R, int C, int[][] matrix) {
        int[] flattenedMatrix = new int[R * C];

        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                flattenedMatrix[index++] = matrix[i][j];
            }
        }

        Arrays.sort(flattenedMatrix);

        return flattenedMatrix[R * C / 2];
    }

    public static void main(String[] args) {
        // Example usage
        int R1 = 3, C1 = 3;
        int[][] M1 = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println(median(R1, C1, M1));  // Output: 5

        int R2 = 3, C2 = 1;
        int[][] M2 = {{1}, {2}, {3}};
        System.out.println(median(R2, C2, M2));  // Output: 2
    }
}
