import java.util.PriorityQueue;

public class KthSmallestElement {
    static class Node implements Comparable<Node> {
        int value;
        int row;
        int col;

        Node(int val, int r, int c) {
            value = val;
            row = r;
            col = c;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.value, other.value);
        }
    }

    public static int kthSmallest(int[][] mat, int N, int K) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            minHeap.add(new Node(mat[i][0], i, 0));
        }

        while (K > 1) {
            Node current = minHeap.poll();

            if (current.col + 1 < N) {
                minHeap.add(new Node(mat[current.row][current.col + 1], current.row, current.col + 1));
            }

            K--;
        }

        return minHeap.peek().value;
    }

    public static void main(String[] args) {
        // Example usage
        int N1 = 4;
        int[][] mat1 = {{16, 28, 60, 64}, {22, 41, 63, 91}, {27, 50, 87, 93}, {36, 78, 87, 94}};
        int K1 = 3;
        System.out.println(kthSmallest(mat1, N1, K1));  // Output: 27

        int N2 = 4;
        int[][] mat2 = {{10, 20, 30, 40}, {15, 25, 35, 45}, {24, 29, 37, 48}, {32, 33, 39, 50}};
        int K2 = 7;
        System.out.println(kthSmallest(mat2, N2, K2));  // Output: 30
    }
}
