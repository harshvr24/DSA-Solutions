#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int T;
    cin >> T;

    while (T--) {
        int N, K;
        cin >> N >> K;

        vector<int> A(N);

        for (int i = 0; i < N; i++) {
            cin >> A[i];
        }

        long long maxSum = A[0];
        long long currentSum = A[0];

        for (int i = 1; i < N * K; i++) {
            currentSum = max((long long)A[i % N], currentSum + A[i % N]);
            maxSum = max(maxSum, currentSum);
        }

        cout << maxSum << endl;
    }

    return 0;
}
