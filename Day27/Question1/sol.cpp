#include <iostream>
#include <vector>
#include <limits>

using namespace std;

void findInterestingSubarray(const vector<int>& a) {
    int n = a.size();
    int min_val = numeric_limits<int>::max();
    int max_val = numeric_limits<int>::min();
    int min_index = -1;
    int max_index = -1;

    for (int i = 0; i < n; i++) {
        if (a[i] < min_val) {
            min_val = a[i];
            min_index = i + 1;
        }

        if (a[i] > max_val) {
            max_val = a[i];
            max_index = i + 1;
        }

        if (max_val - min_val >= i + 1) {
            cout << "YES" << endl;
            cout << min_index << " " << i + 1 << endl;
            return;
        }
    }

    cout << "NO" << endl;
}

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        vector<int> a(n);
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }

        findInterestingSubarray(a);
    }

    return 0;
}
