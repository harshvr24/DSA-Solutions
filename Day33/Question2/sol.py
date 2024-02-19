def row_with_max_1s(N, M, arr):
    row = -1
    col = M - 1

    for i in range(N):
        while col >= 0 and arr[i][col] == 1:
            row = i
            col -= 1

    return row

# Example usage
N1, M1 = 4, 4
Arr1 = [[0, 1, 1, 1], [0, 0, 1, 1], [1, 1, 1, 1], [0, 0, 0, 0]]
print(row_with_max_1s(N1, M1, Arr1))  # Output: 2

N2, M2 = 2, 2
Arr2 = [[0, 0], [1, 1]]
print(row_with_max_1s(N2, M2, Arr2))  # Output: 1
