def napoleon_cake(layers):
    n = len(layers)
    result = [0] * n  # Initialize a result array with zeros

    for i in range(n - 1, -1, -1):
        result[i] = 1  # Place a 1 at the current position
        if layers[i] > 1:
            # If the current layer has more than 1 segment, update the previous positions
            result[i - layers[i] + 1:i] = [1] * (layers[i] - 1)

    return result

# Example
layers = [1, 2, 3, 4, 1]
result = napoleon_cake(layers)
print(result)
