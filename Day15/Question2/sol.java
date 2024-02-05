// Java program to find the number of jumps 
// to reach X in the number line from zero 

class GFG 
{ 
	
// Utility function to calculate sum 
// of numbers from 1 to x 
static int getsum(int x) 
{ 
	return (x * (x + 1)) / 2; 
} 

// Function to find the number of jumps 
// to reach X in the number line from zero 
static int countJumps(int n) 
{ 
	// First make number positive 
	// Answer will be same either it is 
	// Positive or negative 
	n = Math.abs(n); 

	// To store required answer 
	int ans = 0; 

	// Continue till number is lesser
	// or not in same parity 
	while (getsum(ans) < n || 
		((getsum(ans) - n) & 1) > 0) 
		ans++; 

	// Return the required answer 
	return ans; 
} 

// Driver code 
public static void main(String args[]) 
{ 
	int n = 9; 

	System.out.println(countJumps(n)); 
} 
} 

// This code is contributed by Ryuga 
