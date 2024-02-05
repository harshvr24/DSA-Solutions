def min_swap(arr, n, k):
    count = 0
    for i in range(n):
        if arr[i] <= k:
            count += 1

    bad = 0
    for i in range(count):
        if arr[i] > k:
            bad += 1

    min_swaps = bad
    for i in range(count, n):
        if arr[i - count] > k:
            bad -= 1
        if arr[i] > k:
            bad += 1
        min_swaps = min(min_swaps, bad)

    return min_swaps

# Example usage:
arr1 = [2, 1, 5, 6, 3]
k1 = 3
print("Example 1:", min_swap(arr1, len(arr1), k1))

arr2 = [2, 7, 9, 5, 8, 7, 4]
k2 = 6
print("Example 2:", min_swap(arr2, len(arr2), k2))
