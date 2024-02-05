public class MinSwap {

    static int minSwap(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] <= k) {
                count++;
            }
        }

        int bad = 0;
        for (int i = 0; i < count; ++i) {
            if (arr[i] > k) {
                bad++;
            }
        }

        int minSwaps = bad;
        for (int i = count; i < n; ++i) {
            if (arr[i - count] > k) {
                bad--;
            }
            if (arr[i] > k) {
                bad++;
            }
            minSwaps = Math.min(minSwaps, bad);
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 6, 3};
        int k1 = 3;
        System.out.println("Example 1: " + minSwap(arr1, arr1.length, k1));

        int[] arr2 = {2, 7, 9, 5, 8, 7, 4};
        int k2 = 6;
        System.out.println("Example 2: " + minSwap(arr2, arr2.length, k2));
    }
}
