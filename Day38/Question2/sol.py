def paint(A, B, C):
    low = max(C)
    high = sum(C)
    result = -1

    while low <= high:
        mid = low + (high - low) // 2
        painters = 1
        current_sum = 0

        for length in C:
            if current_sum + length > mid:
                painters += 1
                current_sum = length
            else:
                current_sum += length

        if painters <= A:
            result = mid
            high = mid - 1
        else:
            low = mid + 1

    return (result * B) % 10000003

# Example usage
A1, B1, C1 = 2, 5, [1, 10]
A2, B2, C2 = 10, 1, [1, 8, 11, 3]

print(paint(A1, B1, C1))  # Output: 50
print(paint(A2, B2, C2))  # Output: 11
