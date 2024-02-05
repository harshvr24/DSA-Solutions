# Program to find minimum number of platforms
# required on a railway station


def findPlatform(arr, dep, n):
	'''
	Accepts two arrays with arrival and departure time
	and the size of the array
	Returns minimum number of platforms required
	'''

	# plat_needed indicates number of platforms
	# needed at a time
	plat_needed = 1
	result = 1

	# run a nested loop to find overlap
	for i in range(n):
		# minimum platform needed
		plat_needed = 1

		for j in range(n):
			# check for overlap
			if i != j:
				if (arr[i] >= arr[j] and dep[j] >= arr[i]):
					plat_needed += 1

		# update result
		result = max(result, plat_needed)

	return result

# Driver code


def main():
	arr = [100, 300, 500]
	dep = [900, 400, 600]

	n = len(arr)

	print("{}".format(
		findPlatform(arr, dep, n)))


if __name__ == '__main__':
	main()
