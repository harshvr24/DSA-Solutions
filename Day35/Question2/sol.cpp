#include <iostream>
#include <queue>
#include <vector>

using namespace std;

struct Node {
    int value;
    int row;
    int col;

    Node(int val, int r, int c) : value(val), row(r), col(c) {}

    bool operator>(const Node& other) const {
        return value > other.value;
    }
};

int kthSmallest(vector<vector<int>>& mat, int N, int K) {
    priority_queue<Node, vector<Node>, greater<Node>> minHeap;

    for (int i = 0; i < N; i++) {
        minHeap.push(Node(mat[i][0], i, 0));
    }

    while (K > 1) {
        Node current = minHeap.top();
        minHeap.pop();

        if (current.col + 1 < N) {
            minHeap.push(Node(mat[current.row][current.col + 1], current.row, current.col + 1));
        }

        K--;
    }

    return minHeap.top().value;
}

int main() {
    // Example usage
    int N1 = 4;
    vector<vector<int>> mat1 = {{16, 28, 60, 64}, {22, 41, 63, 91}, {27, 50, 87, 93}, {36, 78, 87, 94}};
    int K1 = 3;
    cout << kthSmallest(mat1, N1, K1) << endl;  // Output: 27

    int N2 = 4;
    vector<vector<int>> mat2 = {{10, 20, 30, 40}, {15, 25, 35, 45}, {24, 29, 37, 48}, {32, 33, 39, 50}};
    int K2 = 7;
    cout << kthSmallest(mat2, N2, K2) << endl;  // Output: 30

    return 0;
}
