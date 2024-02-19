#include <stdio.h>

void reverseArraySegment(int arr[], int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

int isSorted(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return 0;
        }
    }
    return 1;
}

int main() {
    int n;
    scanf("%d", &n);
    int a[n];

    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
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
        printf("yes\n");
        printf("1 1\n");
    } else {
        reverseArraySegment(a, start, end);
        if (isSorted(a, n)) {
            printf("yes\n");
            printf("%d %d\n", start + 1, end + 1);
        } else {
            printf("no\n");
        }
    }

    return 0;
}
