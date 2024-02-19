def max_cakes_with_height_k(t, test_cases):
    for i in range(t):
        n, k = test_cases[i][0]
        operations = test_cases[i][1:]

        cake_count = [0] * (n + 2)

        for j in range(1, n + 1):
            l, r = operations[j]
            cake_count[l] += 1
            cake_count[r + 1] -= 1

        prefix_sum = [0] * (n + 1)
        max_cakes = 0

        for j in range(1, n + 1):
            prefix_sum[j] = prefix_sum[j - 1] + cake_count[j]
            max_cakes = max(max_cakes, prefix_sum[j])

        result = max_cakes + min(cake_count[1], cake_count[n + 1])  # Simulate removing one operation

        print(result)

# Example usage
t = 2
test_cases = [
    [(3, 2), (1, 2), (2, 3), (1, 3)],
    [(4, 3), (1, 2), (2, 3), (3, 4), (1, 4)]
]

max_cakes_with_height_k(t, test_cases)
