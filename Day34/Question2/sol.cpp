// A Naive method to find maximum value of mat[d][e]
// - ma[a][b] such that d > a and e > b
#include <bits/stdc++.h>
using namespace std;
#define N 5

// The function returns maximum value A(d,e) - A(a,b)
// over all choices of indexes such that both d > a
// and e > b.
int findMaxValue(int mat[][N])
{
	// stores maximum value
	int maxValue = INT_MIN;

	// Consider all possible pairs mat[a][b] and
	// mat[d][e]
	for (int a = 0; a < N - 1; a++)
	for (int b = 0; b < N - 1; b++)
		for (int d = a + 1; d < N; d++)
		for (int e = b + 1; e < N; e++)
			if (maxValue < (mat[d][e] - mat[a][b]))
				maxValue = mat[d][e] - mat[a][b];

	return maxValue;
}

// Driver program to test above function
int main()
{
int mat[N][N] = {
				{ 1, 2, -1, -4, -20 },
				{ -8, -3, 4, 2, 1 },
				{ 3, 8, 6, 1, 3 },
				{ -4, -1, 1, 7, -6 },
				{ 0, -4, 10, -5, 1 }
			};
	cout << "Maximum Value is "
		<< findMaxValue(mat);

	return 0;
}
