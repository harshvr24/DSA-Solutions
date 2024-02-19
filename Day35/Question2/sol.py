import heapq

def kth_smallest(mat, N, K):
    min_heap = []

    for i in range(N):
        heapq.heappush(min_heap, (mat[i][0], i, 0))

    while K > 1:
        current = heapq.heappop(min_heap)

        if current[2] + 1 < N:
            heapq.heappush(min_heap, (mat[current[1]][current[2] + 1], current[1], current[2] + 1))

        K -= 1

    return min_heap[0][0]

# Example usage
N1 = 4
mat1 = [[16, 28, 60, 64], [22, 41, 63, 91], [27, 50, 87, 93], [36, 78, 87, 94]]
K1 = 3
print(kth_smallest(mat1, N1, K1))  # Output: 27

N2 = 4
mat2 = [[10, 20, 30, 40], [15, 25, 35, 45], [24, 29, 37, 48], [32, 33, 39, 50]]
K2 = 7
print(kth_smallest(mat2, N2, K2))  # Output: 30
