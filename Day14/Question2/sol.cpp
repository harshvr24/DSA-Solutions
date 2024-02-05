#include <iostream>
#include <vector>

using namespace std;

bool is_prime(int num) {
    if (num < 2) {
        return false;
    }
    for (int i = 2; i * i <= num; ++i) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

vector<int> generate_primes(int m, int n) {
    vector<int> primes;
    for (int i = m; i <= n; ++i) {
        if (is_prime(i)) {
            primes.push_back(i);
        }
    }
    return primes;
}

int main() {
    int t;
    cin >> t;
    
    for (int i = 0; i < t; ++i) {
        int m, n;
        cin >> m >> n;
        
        vector<int> primes = generate_primes(m, n);
        
        for (int prime : primes) {
            cout << prime << endl;
        }
        cout << endl;
    }

    return 0;
}
