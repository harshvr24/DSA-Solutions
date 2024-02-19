import java.util.ArrayList;
import java.util.List;

public class MaxCakesWithHeightK {
    public static void maxCakesWithHeightK(int t, List<List<Pair<Integer, Integer>>> testCases) {
        for (int i = 0; i < t; i++) {
            int n = testCases.get(i).get(0).getKey();
            int k = testCases.get(i).get(0).getValue();
            List<Pair<Integer, Integer>> operations = testCases.get(i);

            List<Integer> cakeCount = new ArrayList<>(n + 2);
            for (int j = 0; j <= n + 1; j++) {
                cakeCount.add(0);
            }

            for (int j = 1; j <= n; j++) {
                int l = operations.get(j).getKey();
                int r = operations.get(j).getValue();
                cakeCount.set(l, cakeCount.get(l) + 1);
                cakeCount.set(r + 1, cakeCount.get(r + 1) - 1);
            }

            List<Integer> prefixSum = new ArrayList<>(n + 1);
            for (int j = 0; j <= n; j++) {
                prefixSum.add(0);
            }
            int maxCakes = 0;

            for (int j = 1; j <= n; j++) {
                prefixSum.set(j, prefixSum.get(j - 1) + cakeCount.get(j));
                maxCakes = Math.max(maxCakes, prefixSum.get(j));
            }

            int result = maxCakes + Math.min(cakeCount.get(1), cakeCount.get(n + 1));  // Simulate removing one operation

            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        // Example usage
        int t = 2;
        List<List<Pair<Integer, Integer>>> testCases = new ArrayList<>();
        testCases.add(List.of(new Pair<>(3, 2), new Pair<>(1, 2), new Pair<>(2, 3), new Pair<>(1, 3)));
        testCases.add(List.of(new Pair<>(4, 3), new Pair<>(1, 2), new Pair<>(2, 3), new Pair<>(3, 4), new Pair<>(1, 4)));

        maxCakesWithHeightK(t, testCases);
    }

    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
