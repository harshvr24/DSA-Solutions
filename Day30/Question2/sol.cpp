#include <iostream>
#include <vector>

using namespace std;

void maxCakesWithHeightK(int t, vector<vector<pair<int, int>>>& testCases) {
    for (int i = 0; i < t; i++) {
        int n = testCases[i][0].first;
        int k = testCases[i][0].second;
        vector<pair<int, int>> operations = testCases[i];

        vector<int> cakeCount(n + 2, 0);

        for (int j = 1; j <= n; j++) {
            int l = operations[j].first;
            int r = operations[j].second;
            cakeCount[l]++;
            cakeCount[r + 1]--;
        }

        vector<int> prefixSum(n + 1, 0);
        int maxCakes = 0;

        for (int j = 1; j <= n; j++) {
            prefixSum[j] = prefixSum[j - 1] + cakeCount[j];
            maxCakes = max(maxCakes, prefixSum[j]);
        }

        int result = maxCakes + min(cakeCount[1], cakeCount[n + 1]);  // Simulate removing one operation

        cout << result << endl;
    }
}

int main() {
    // Example usage
    int t = 2;
    vector<vector<pair<int, int>>> testCases = {
        {{3, 2}, {1, 2}, {2, 3}, {1, 3}},
        {{4, 3}, {1, 2}, {2, 3}, {3, 4}, {1, 4}}
    };

    maxCakesWithHeightK(t, testCases);

    return 0;
}
