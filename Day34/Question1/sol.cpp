#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<vector<int>> sortedMatrix(int N, vector<vector<int>>& Mat) {
    vector<int> flattenedMatrix;

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            flattenedMatrix.push_back(Mat[i][j]);
        }
    }

    sort(flattenedMatrix.begin(), flattenedMatrix.end());

    vector<vector<int>> result(N, vector<int>(N));

    int index = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            result[i][j] = flattenedMatrix[index++];
        }
    }

    return result;
}

int main() {
    // Example usage
    int N1 = 4;
    vector<vector<int>> Mat1 = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
    vector<vector<int>> result1 = sortedMatrix(N1, Mat1);

    for (int i = 0; i < N1; i++) {
        for (int j = 0; j < N1; j++) {
            cout << result1[i][j] << " ";
        }
        cout << endl;
    }

    int N2 = 3;
    vector<vector<int>> Mat2 = {{1, 5, 3}, {2, 8, 7}, {4, 6, 9}};
    vector<vector<int>> result2 = sortedMatrix(N2, Mat2);

    for (int i = 0; i < N2; i++) {
        for (int j = 0; j < N2; j++) {
            cout << result2[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
