#include <iostream>
#include <vector>

using namespace std;

int rowWithMax1s(int N, int M, vector<vector<int>>& arr) {
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

int main() {
    // Example usage
    int N1 = 4, M1 = 4;
    vector<vector<int>> Arr1 = {{0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {0, 0, 0, 0}};
    cout << rowWithMax1s(N1, M1, Arr1) << endl;  // Output: 2

    int N2 = 2, M2 = 2;
    vector<vector<int>> Arr2 = {{0, 0}, {1, 1}};
    cout << rowWithMax1s(N2, M2, Arr2) << endl;  // Output: 1

    return 0;
}
