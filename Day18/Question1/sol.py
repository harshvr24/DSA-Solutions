# Function to find if there exists a pair
# of elements in the array whose difference is n
def find_pair(arr, n, diff):
	# Nested loop to compare all possible
	# pairs of elements
	for i in range(n):
		for j in range(n):
			if i == j:
				continue
			
			# If the difference between the
			# two elements is n, print them
			if arr[j] - arr[i] == diff:
				print(f"Pair Found: ({arr[i]}, {arr[j]})")
				return
	
	print("No such pair")

# Input array and diff
arr = [1, 8, 30, 40, 100]
n = len(arr)
diff = -60

# Function call
find_pair(arr, n, diff)
