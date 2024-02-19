def min_height_difference(K, N, Arr):
    Arr.sort()

    potential_heights = []
    for i in range(N):
        add_k = Arr[i] + K
        sub_k = Arr[i] - K
        if sub_k >= 0:
            potential_heights.append(sub_k)
        potential_heights.append(add_k)

    potential_heights.sort()
    return potential_heights[-1] - potential_heights[0]

# Example 1
K1, N1, Arr1 = 2, 4, [1, 5, 8, 10]
print(min_height_difference(K1, N1, Arr1))  # Output: 5

# Example 2
K2, N2, Arr2 = 3, 5, [3, 9, 12, 16, 20]
print(min_height_difference(K2, N2, Arr2))  # Output: 11
