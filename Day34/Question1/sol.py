def sorted_matrix(N, Mat):
    flattened_matrix = [Mat[i][j] for i in range(N) for j in range(N)]

    flattened_matrix.sort()

    result = [[0] * N for _ in range(N)]

    index = 0
    for i in range(N):
        for j in range(N):
            result[i][j] = flattened_matrix[index]
            index += 1

    return result

# Example usage
N1 = 4
Mat1 = [[10, 20, 30, 40], [15, 25, 35, 45], [27, 29, 37, 48], [32, 33, 39, 50]]
result1 = sorted_matrix(N1, Mat1)

for i in range(N1):
    for j in range(N1):
        print(result1[i][j], end=" ")
    print()

N2 = 3
Mat2 = [[1, 5, 3], [2, 8, 7], [4, 6, 9]]
result2 = sorted_matrix(N2, Mat2)

for i in range(N2):
    for j in range(N2):
        print(result2[i][j], end=" ")
    print()
