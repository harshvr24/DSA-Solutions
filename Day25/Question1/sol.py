def partition(arr, l, r):
    pivot = arr[r]
    i = l - 1

    for j in range(l, r):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[r] = arr[r], arr[i + 1]
    return i + 1

def kthSmallest(arr, l, r, K):
    if l <= r:
        partitionIndex = partition(arr, l, r)

        if partitionIndex == K:
            return arr[partitionIndex]
        elif partitionIndex > K:
            return kthSmallest(arr, l, partitionIndex - 1, K)
        else:
            return kthSmallest(arr, partitionIndex + 1, r, K)

# Example usage:
arr1 = [7, 10, 4, 3, 20, 15]
K1 = 2
L1, R1 = 0, 5
print(kthSmallest(arr1, L1, R1, K1))  # Output: 7

arr2 = [7, 10, 4, 20, 15]
K2 = 3
L2, R2 = 0, 4
print(kthSmallest(arr2, L2, R2, K2))  # Output: 15
