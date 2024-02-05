import java.util.Arrays;

public class FindPairWithDifference {
	
	// Function to find if there exists a pair
	// of elements in the array whose difference is n
	static void findPair(int[] arr, int n, int diff) {
		// Nested loop to compare all possible
		// pairs of elements
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;

				// If the difference between the
				// two elements is n, print them
				if ((arr[j] - arr[i]) == diff) {
					System.out.println("Pair Found: (" + arr[i] + ", " + arr[j] + ")");
					return;
				}
			}
		}

		System.out.println("No such pair");
	}

	public static void main(String[] args) {
		// Input array and diff
		int[] arr = { 1, 8, 30, 40, 100 };
		int n = arr.length;
		int diff = -60;

		// Function call
		findPair(arr, n, diff);
	}
}
