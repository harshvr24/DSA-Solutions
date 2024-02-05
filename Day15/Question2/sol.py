# Python 3 program to find the number of jumps
# to reach X in the number line from zero

# Utility function to calculate sum 
# of numbers from 1 to x
def getsum(x):
	return int((x * (x + 1)) / 2)

# Function to find the number of jumps
# to reach X in the number line from zero
def countJumps(n):
	
	# First make number positive
	# Answer will be same either it is
	# Positive or negative
	n = abs(n)

	# To store the required answer
	ans = 0

	# Continue till number is lesser 
	# or not in same parity
	while (getsum(ans) < n or
		(getsum(ans) - n) & 1):
		ans += 1

	# Return the required answer
	return ans

# Driver code
if __name__ == '__main__':
	n = 9

	print(countJumps(n))

# This code is contributed by
# Surendra_Gangwar
