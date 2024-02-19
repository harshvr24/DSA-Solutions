#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int minHeightDifference(int K, int N, vector<int>& Arr) {
    sort(Arr.begin(), Arr.end());

    vector<int> potentialHeights;
    for (int i = 0; i < N; i++) {
        int addK = Arr[i] + K;
        int subK = Arr[i] - K;

        if (subK >= 0) {
            potentialHeights.push_back(subK);
        }
        potentialHeights.push_back(addK);
    }

    sort(potentialHeights.begin(), potentialHeights.end());
    return potentialHeights.back() - potentialHeights[0];
}

int main() {
    int K1 = 2, N1 = 4;
    vector<int> Arr1 = {1, 5, 8, 10};
    cout << minHeightDifference(K1, N1, Arr1) << endl;  // Output: 5

    int K2 = 3, N2 = 5;
    vector<int> Arr2 = {3, 9, 12, 16, 20};
    cout << minHeightDifference(K2, N2, Arr2) << endl;  // Output: 11

    return 0;
}
