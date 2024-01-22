def max_chunks_to_sorted(arr):
    max_chunk_count = 0
    max_value = float('-inf')

    for i, num in enumerate(arr):
        max_value = max(max_value, num)

        if max_value == i:
            max_chunk_count += 1

    return max_chunk_count

# Example
arr = [4, 3, 2, 1, 0]
result = max_chunks_to_sorted(arr)
print(result)
