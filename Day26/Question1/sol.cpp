#include <iostream>
#include <vector>
using namespace std;

string findWinner(int n, int m, vector<int>& A, vector<int>& B) {
    int xorSum = 0;
    
    for (int size : A)
        xorSum ^= size;
    
    for (int size : B)
        xorSum ^= size;
    
    return (xorSum == 0) ? "Bob" : "Alice";
}

int main() {
    int T;
    cin >> T;

    while (T--) {
        int n, m;
        cin >> n >> m;

        vector<int> A(n), B(m);
        for (int i = 0; i < n; ++i)
            cin >> A[i];

        for (int i = 0; i < m; ++i)
            cin >> B[i];

        string result = findWinner(n, m, A, B);
        cout << result << endl;
    }

    return 0;
}
