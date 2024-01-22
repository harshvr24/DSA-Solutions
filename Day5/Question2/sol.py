def max_chunks_to_sorted_2(arr):
    n = len(arr)
    max_chunk_count = 0
    left_max = [0] * n
    right_min = [float('inf')] * n

    max_val = float('-inf')
    for i in range(n):
        max_val = max(max_val, arr[i])
        left_max[i] = max_val

    min_val = float('inf')
    for i in range(n - 1, -1, -1):
        min_val = min(min_val, arr[i])
        right_min[i] = min_val

    for i in range(n - 1):
        if left_max[i] <= right_min[i + 1]:
            max_chunk_count += 1

    return max_chunk_count + 1

arr = [5, 4, 3, 2, 1]
result = max_chunks_to_sorted_2(arr)
print(result)
