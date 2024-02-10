#include <iostream>
#include <algorithm>
using namespace std;

int partition(int arr[], int l, int r) {
    int pivot = arr[r];
    int i = l - 1;

    for (int j = l; j < r; ++j) {
        if (arr[j] <= pivot) {
            i++;
            swap(arr[i], arr[j]);
        }
    }

    swap(arr[i + 1], arr[r]);
    return i + 1;
}

int kthSmallest(int arr[], int l, int r, int K) {
    if (l <= r) {
        int partitionIndex = partition(arr, l, r);

        if (partitionIndex == K) {
            return arr[partitionIndex];
        } else if (partitionIndex > K) {
            return kthSmallest(arr, l, partitionIndex - 1, K);
        } else {
            return kthSmallest(arr, partitionIndex + 1, r, K);
        }
    }
    return -1; // To handle invalid K values
}

int main() {
    int arr1[] = {7, 10, 4, 3, 20, 15};
    int K1 = 2;
    int L1 = 0, R1 = 5;
    cout << kthSmallest(arr1, L1, R1, K1) << endl; // Output: 7

    int arr2[] = {7, 10, 4, 20, 15};
    int K2 = 3;
    int L2 = 0, R2 = 4;
    cout << kthSmallest(arr2, L2, R2, K2) << endl; // Output: 15

    return 0;
}
