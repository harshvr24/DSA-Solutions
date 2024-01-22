#include <iostream>
#include <vector>

using namespace std;

long long gcd(long long a, long long b) {
    while (b != 0) {
        long long temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

void findPairs(long long l, long long r) {
    if (r - l + 1 <= 2) {
        cout << "NO" << endl;
        return;
    }

    cout << "YES" << endl;
    for (long long i = l; i < r; i += 2) {
        cout << i + 1 << " " << i + 2 << endl;
    }
}

int main() {
    long long l, r;
    cin >> l >> r;

    findPairs(l, r);

    return 0;
}
