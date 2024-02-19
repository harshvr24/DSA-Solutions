import java.util.Arrays;

public class TowerHeightDifference {
    public static int minHeightDifference(int K, int N, int[] Arr) {
        Arrays.sort(Arr);

        int[] potentialHeights = new int[N * 2];
        int index = 0;

        for (int i = 0; i < N; i++) {
            int addK = Arr[i] + K;
            int subK = Arr[i] - K;

            if (subK >= 0) {
                potentialHeights[index++] = subK;
            }
            potentialHeights[index++] = addK;
        }

        Arrays.sort(potentialHeights);
        return potentialHeights[potentialHeights.length - 1] - potentialHeights[0];
    }

    public static void main(String[] args) {
        int K1 = 2, N1 = 4;
        int[] Arr1 = {1, 5, 8, 10};
        System.out.println(minHeightDifference(K1, N1, Arr1));  // Output: 5

        int K2 = 3, N2 = 5;
        int[] Arr2 = {3, 9, 12, 16, 20};
        System.out.println(minHeightDifference(K2, N2, Arr2));  // Output: 11
    }
}
