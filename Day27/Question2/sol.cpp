#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    int start = -1, end = -1;

    for (int i = 0; i < n - 1; i++) {
        if (a[i] > a[i + 1]) {
            start = i;
            break;
        }
    }

    for (int i = n - 1; i > 0; i--) {
        if (a[i] < a[i - 1]) {
            end = i;
            break;
        }
    }

    if (start == -1 && end == -1) {
        cout << "yes" << endl;
        cout << "1 1" << endl;
    } else {
        reverse(a.begin() + start, a.begin() + end + 1);
        if (is_sorted(a.begin(), a.end())) {
            cout << "yes" << endl;
            cout << start + 1 << " " << end + 1 << endl;
        } else {
            cout << "no" << endl;
        }
    }

    return 0;
}
