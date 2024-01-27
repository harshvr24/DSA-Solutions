# Python3 program for the above approach


def checkString(s1, s2, indexFound, Size):
	for i in range(Size):

		# check whether the character is equal or not
		if(s1[i] != s2[(indexFound + i) % Size]):
			return False

		# %Size keeps (indexFound+i) in bounds,
		# since it ensures it's value is always less than Size
	return True


# driver code
s1 = "abcd"
s2 = "cdab"

if(len(s1) != len(s2)):
	print("s2 is not a rotation on s1")

else:

	indexes = [] # store occurrences of the first character of s1
	Size = len(s1)
	firstChar = s1[0]
	for i in range(Size):
		if(s2[i] == firstChar):
			indexes.append(i)

	isRotation = False

	# check if the strings are rotation of each other
	# for every occurrence of firstChar in s2
	for idx in indexes:

		isRotation = checkString(s1, s2, idx, Size)

		if(isRotation):
			break

	if(isRotation):
		print("Strings are rotations of each other")
	else:
		print("Strings are not rotations of each other")

# This code is contributed by shinjanpatra
