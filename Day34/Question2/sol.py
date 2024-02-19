# A Naive method to find maximum 
# value of mat[d][e] - mat[a][b]
# such that d > a and e > b
N = 5

# The function returns maximum 
# value A(d,e) - A(a,b) over 
# all choices of indexes such 
# that both d > a and e > b.
def findMaxValue(mat):
	
	# stores maximum value
	maxValue = 0

	# Consider all possible pairs 
	# mat[a][b] and mat[d][e]
	for a in range(N - 1):
		for b in range(N - 1):
			for d in range(a + 1, N):
				for e in range(b + 1, N):
					if maxValue < int (mat[d][e] -
									mat[a][b]):
						maxValue = int(mat[d][e] -
									mat[a][b]);

	return maxValue;

# Driver Code
mat = [[ 1, 2, -1, -4, -20 ],
	[ -8, -3, 4, 2, 1 ],
	[ 3, 8, 6, 1, 3 ],
	[ -4, -1, 1, 7, -6 ],
	[ 0, -4, 10, -5, 1 ]];
		
print("Maximum Value is " +
	str(findMaxValue(mat)))
	
# This code is contributed 
# by ChitraNayal
