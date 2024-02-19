#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int median(int R, int C, vector<vector<int>>& matrix) {
    vector<int> flattenedMatrix;
    
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            flattenedMatrix.push_back(matrix[i][j]);
        }
    }

    sort(flattenedMatrix.begin(), flattenedMatrix.end());

    return flattenedMatrix[R * C / 2];
}

int main() {
    // Example usage
    int R1 = 3, C1 = 3;
    vector<vector<int>> M1 = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
    cout << median(R1, C1, M1) << endl;  // Output: 5

    int R2 = 3, C2 = 1;
    vector<vector<int>> M2 = {{1}, {2}, {3}};
    cout << median(R2, C2, M2) << endl;  // Output: 2

    return 0;
}
