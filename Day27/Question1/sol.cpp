#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);

    for (int testCase = 0; testCase < t; testCase++) {
        int n;
        scanf("%d", &n);
        int a[n];

        for (int i = 0; i < n; i++) {
            scanf("%d", &a[i]);
        }

        int minVal = __INT_MAX__;
        int maxVal = __INT_MIN__;
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] < minVal) {
                minVal = a[i];
                minIndex = i + 1;
            }

            if (a[i] > maxVal) {
                maxVal = a[i];
                maxIndex = i + 1;
            }

            if (maxVal - minVal >= i + 1) {
                printf("YES\n");
                printf("%d %d\n", minIndex, i + 1);
                break;
            }
        }

        if (maxVal - minVal < n) {
            printf("NO\n");
        }
    }

    return 0;
}
