import java.util.Arrays;

public class Solution {
    public int paint(int A, int B, int[] C) {
        long low = Arrays.stream(C).max().getAsInt();
        long high = Arrays.stream(C).sum();
        long result = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            int painters = 1, currentSum = 0;

            for (int i = 0; i < C.length; ++i) {
                if (currentSum + C[i] > mid) {
                    painters++;
                    currentSum = C[i];
                } else {
                    currentSum += C[i];
                }
            }

            if (painters <= A) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ((result * B) % 10000003);
    }
}
