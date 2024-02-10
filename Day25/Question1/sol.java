public class KthSmallestElement {

    static int partition(int arr[], int l, int r) {
        int pivot = arr[r];
        int i = l - 1;

        for (int j = l; j < r; ++j) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    static int kthSmallest(int arr[], int l, int r, int K) {
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

    public static void main(String[] args) {
        int arr1[] = {7, 10, 4, 3, 20, 15};
        int K1 = 2;
        int L1 = 0, R1 = 5;
        System.out.println(kthSmallest(arr1, L1, R1, K1)); // Output: 7

        int arr2[] = {7, 10, 4, 20, 15};
        int K2 = 3;
        int L2 = 0, R2 = 4;
        System.out.println(kthSmallest(arr2, L2, R2, K2)); // Output: 15
    }
}
