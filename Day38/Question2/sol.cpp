#include <vector>
#include <algorithm>
using namespace std;

int paint(int A, int B, vector<int> &C) {
    long long low = *max_element(C.begin(), C.end());
    long long high = accumulate(C.begin(), C.end(), 0LL);
    long long result = -1;

    while (low <= high) {
        long long mid = low + (high - low) / 2;
        int painters = 1, current_sum = 0;

        for (int i = 0; i < C.size(); ++i) {
            if (current_sum + C[i] > mid) {
                painters++;
                current_sum = C[i];
            } else {
                current_sum += C[i];
            }
        }

        if (painters <= A) {
            result = mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return (result * B) % 10000003;
}
