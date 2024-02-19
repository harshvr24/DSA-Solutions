def median(R, C, matrix):
    flattened_matrix = [matrix[i][j] for i in range(R) for j in range(C)]

    flattened_matrix.sort()

    return flattened_matrix[R * C // 2]

# Example usage
R1, C1 = 3, 3
M1 = [[1, 3, 5], [2, 6, 9], [3, 6, 9]]
print(median(R1, C1, M1))  # Output: 5

R2, C2 = 3, 1
M2 = [[1], [2], [3]]
print(median(R2, C2, M2))  # Output: 2
