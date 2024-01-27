#include <iostream>

using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n, k;
        cin >> n >> k;

        // Set a1 and a2 to 1, and distribute the remaining sum to a3, a4, ..., ak.
        cout << 1 << " " << 1 << " ";
        for (int i = 3; i <= k; ++i) {
            cout << (n - k + i - 1) << " ";
        }
        cout << endl;
    }

    return 0;
}
