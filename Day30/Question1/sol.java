import java.util.ArrayList;
import java.util.List;

public class ModifiedArray {
    public static List<Integer> getModifiedArray(int n, List<List<Integer>> updates) {
        List<Integer> result = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            result.add(0);
        }

        for (List<Integer> update : updates) {
            int startIndex = update.get(0);
            int endIndex = update.get(1);
            int inc = update.get(2);

            result.set(startIndex, result.get(startIndex) + inc);

            if (endIndex + 1 < n) {
                result.set(endIndex + 1, result.get(endIndex + 1) - inc);
            }
        }

        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += result.get(i);
            result.set(i, currentSum);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 5;
        List<List<Integer>> updates = List.of(
                List.of(1, 3, 2),
                List.of(2, 4, 3),
                List.of(0, 2, -2)
        );

        List<Integer> result = getModifiedArray(n, updates);

        // Output the modified array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
