#include <iostream>
#include <vector>

using namespace std;

void napoleonCake(vector<int>& cream) {
    int n = cream.size();
    int creamLeft = 0;

    for (int i = n - 1; i >= 0; i--) {
        creamLeft = max(creamLeft, cream[i]);
        cream[i] = (creamLeft > 0) ? 1 : 0;
        creamLeft--;
    }
}

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        vector<int> cream(n);
        for (int i = 0; i < n; i++) {
            cin >> cream[i];
        }

        napoleonCake(cream);

        for (int i = 0; i < n; i++) {
            cout << cream[i] << " ";
        }
        cout << endl;
    }

    return 0;
}
