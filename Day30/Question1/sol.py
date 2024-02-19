def get_modified_array(n, updates):
    result = [0] * n

    for update in updates:
        startIndex, endIndex, inc = update
        result[startIndex] += inc

        if endIndex + 1 < n:
            result[endIndex + 1] -= inc

    current_sum = 0
    for i in range(n):
        current_sum += result[i]
        result[i] = current_sum

    return result

# Example usage
n = 5
updates = [[1, 3, 2], [2, 4, 3], [0, 2, -2]]

result = get_modified_array(n, updates)

# Output the modified array
print(*result)
