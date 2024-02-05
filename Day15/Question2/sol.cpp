// C++ program to find the number of jumps
// to reach X in the number line from zero

#include <bits/stdc++.h>
using namespace std;

// Utility function to calculate sum 
// of numbers from 1 to x
int getsum(int x)
{
	return (x * (x + 1)) / 2;
}

// Function to find the number of jumps
// to reach X in the number line from zero
int countJumps(int n)
{
	// First make number positive
	// Answer will be same either it is
	// Positive or negative
	n = abs(n);

	// To store required answer
	int ans = 0;

	// Continue till number is lesser or not in same parity
	while (getsum(ans) < n or (getsum(ans) - n) & 1)
		ans++;

	// Return the required answer
	return ans;
}

// Driver code
int main()
{
	int n = 9;

	cout << countJumps(n);

	return 0;
}
