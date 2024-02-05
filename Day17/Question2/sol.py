# This python program tells if there exists a pair in array whose sum results in x.

# Function to find and print pair


def chkPair(A, size, x):
	for i in range(0, size - 1):
		for j in range(i + 1, size):
			if (A[i] + A[j] == x):
				return 1
	return 0


if __name__ == "__main__":
	A = [0, -1, 2, -3, 1]
	x = -2
	size = len(A)

	if (chkPair(A, size, x)):
		print("Yes")

	else:
		print("No")

	# This code is contributed by rakeshsahni
