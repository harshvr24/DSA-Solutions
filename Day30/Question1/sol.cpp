#include <iostream>
#include <vector>

using namespace std;

vector<int> getModifiedArray(int n, vector<vector<int>>& updates) {
    vector<int> result(n, 0);

    for (const auto& update : updates) {
        int startIndex = update[0];
        int endIndex = update[1];
        int inc = update[2];

        result[startIndex] += inc;

        if (endIndex + 1 < n) {
            result[endIndex + 1] -= inc;
        }
    }

    int currentSum = 0;
    for (int i = 0; i < n; i++) {
        currentSum += result[i];
        result[i] = currentSum;
    }

    return result;
}

int main() {
    // Example usage
    int n = 5;
    vector<vector<int>> updates = {{1, 3, 2}, {2, 4, 3}, {0, 2, -2}};

    vector<int> result = getModifiedArray(n, updates);

    // Output the modified array
    for (int num : result) {
        cout << num << " ";
    }

    return 0;
}
